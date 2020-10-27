package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Bairro;
import br.com.viniciusmargotti.javaspringapi.models.Loja;
import br.com.viniciusmargotti.javaspringapi.repository.BairroRepository;
import br.com.viniciusmargotti.javaspringapi.repository.LojaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value="Bairros")
@RequestMapping(value="/bairros")
@CrossOrigin
public class BairroResource {

    @Autowired
    private BairroRepository bairroRepository;

    @ApiOperation(value="Busca todos os bairros")
    @RequestMapping(method = RequestMethod.GET)
    public List<Bairro> getAll() {
        return bairroRepository.findAll();
    }

}
