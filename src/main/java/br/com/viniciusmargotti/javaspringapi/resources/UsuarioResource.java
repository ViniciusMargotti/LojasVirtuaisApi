package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.business.UsuarioService;
import br.com.viniciusmargotti.javaspringapi.dtos.UsuarioDTO;
import br.com.viniciusmargotti.javaspringapi.models.Usuario;
import br.com.viniciusmargotti.javaspringapi.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.util.List;

@RestController
@Api(value="Usuarios")
@RequestMapping(value="/usuarios")
@CrossOrigin
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @ApiOperation(value="Salva um novo usuário")
    @PostMapping("save")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO) {
            return new ResponseEntity<>(usuarioService.saveUsuario(usuarioDTO), HttpStatus.OK);
    }

    @ApiOperation(value="Busca todos os usuários")
    @GetMapping("getAll")
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }


}
