package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Pessoa;
import br.com.viniciusmargotti.javaspringapi.models.Usuario;
import br.com.viniciusmargotti.javaspringapi.repository.PessoaRepository;
import br.com.viniciusmargotti.javaspringapi.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value="Pessoas")
@RequestMapping(value="/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @ApiOperation(value="Salva uma pessoa")
    @PostMapping("save")
    public Pessoa savePessoa(@RequestBody @Valid Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @ApiOperation(value="Busca todos as pessoas")
    @GetMapping("getAll")
    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }


}
