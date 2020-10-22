package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Loja;
import br.com.viniciusmargotti.javaspringapi.repository.LojaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value="Lojas")
@RequestMapping(value="/lojas")
public class LojaResource {

    @Autowired
    private LojaRepository lojaRepository;

    @ApiOperation(value="Salva uma loja")
    @PostMapping("save")
    public Loja saveLoja(@RequestBody @Valid Loja loja) {
        return lojaRepository.save(loja);
    }

    @ApiOperation(value="Busca todos as lojas")
    @GetMapping("getAll")
    public List<Loja> getAll() {
        return lojaRepository.findAll();
    }

}
