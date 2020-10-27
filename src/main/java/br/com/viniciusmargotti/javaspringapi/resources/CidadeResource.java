package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Cidade;
import br.com.viniciusmargotti.javaspringapi.repository.CidadeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="Cidades")
@RequestMapping(value="/cidades")
@CrossOrigin
public class CidadeResource {

    @Autowired
    private CidadeRepository cidadeRepository;

    @ApiOperation(value="Busca todas as cidades")
    @RequestMapping(method = RequestMethod.GET)
    public List<Cidade> getAll() {
        return cidadeRepository.findAll();
    }

}
