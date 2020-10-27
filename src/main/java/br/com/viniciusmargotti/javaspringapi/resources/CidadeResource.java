package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Cidade;
import br.com.viniciusmargotti.javaspringapi.repository.CidadeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="Cidades")
@RequestMapping(value="/cidades")
@CrossOrigin
public class CidadeResource {

    @Autowired
    private CidadeRepository cidadeRepository;

    @ApiOperation(value="Busca todas as cidades")
    @RequestMapping(method = RequestMethod.GET,value = "/{idEstado}")
    public List<Cidade> findByEstadoId(@PathVariable Long idEstado) {
        return cidadeRepository.findByEstadoId(idEstado);
    }

}
