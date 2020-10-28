package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.business.UsuarioBusiness;
import br.com.viniciusmargotti.javaspringapi.dtos.UsuarioDTO;
import br.com.viniciusmargotti.javaspringapi.models.Usuario;
import br.com.viniciusmargotti.javaspringapi.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value="Usuarios")
@RequestMapping(value="/usuarios")
@CrossOrigin
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioBusiness usuarioBusiness;


    @ApiOperation(value="Salva um novo usuário")
    @PostMapping("save")
    public Usuario saveUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        try {
            return usuarioBusiness.saveUsuario(usuarioDTO);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    @ApiOperation(value="Busca todos os usuários")
    @GetMapping("getAll")
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }


}
