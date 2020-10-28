package br.com.viniciusmargotti.javaspringapi.business;

import br.com.viniciusmargotti.javaspringapi.dtos.PessoaDTO;
import br.com.viniciusmargotti.javaspringapi.dtos.UsuarioDTO;
import br.com.viniciusmargotti.javaspringapi.models.Bairro;
import br.com.viniciusmargotti.javaspringapi.models.Pessoa;
import br.com.viniciusmargotti.javaspringapi.models.Usuario;
import br.com.viniciusmargotti.javaspringapi.repository.BairroRepository;
import br.com.viniciusmargotti.javaspringapi.repository.PessoaRepository;
import br.com.viniciusmargotti.javaspringapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioBusiness {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BairroRepository bairroRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario saveUsuario(UsuarioDTO usuarioDTO) {

        validaUsuarioDuplicado(usuarioDTO);

        PessoaDTO pessoaDTO = usuarioDTO.getPessoa();

        Bairro bairro = pessoaDTO.getBairro()!= null ? bairroRepository.findById(pessoaDTO.getBairro().getId()).get() : null;

        Pessoa pessoa = new Pessoa.Builder().cep(pessoaDTO.getCep())
                .complemento(pessoaDTO.getComplemento())
                .bairro(bairro)
                .endereco(pessoaDTO.getEndereco())
                .nome(pessoaDTO.getNome())
                .sobrenome(pessoaDTO.getSobrenome())
                .numero(pessoaDTO.getNumero())
                .referencia(pessoaDTO.getReferencia()).build();

        Pessoa pessoaCadastrada = pessoaRepository.save(pessoa);

        Usuario usuario = new Usuario.Builder()
                .email(usuarioDTO.getEmail())
                .pessoa(pessoaCadastrada)
                .senha(passwordEncoder.encode(usuarioDTO.getSenha())).build();

        return usuarioRepository.save(usuario);
    }

    private void validaUsuarioDuplicado(UsuarioDTO usuario) {
        Usuario usuarioExistente = usuarioRepository.findByEmail(usuario.getEmail());

        if (usuarioExistente != null && usuarioExistente.getId().equals(usuario.getId())) {
            new RuntimeException("Já existe um usuário cadastrado para o email " + usuario.getEmail());
        }
    }
}
