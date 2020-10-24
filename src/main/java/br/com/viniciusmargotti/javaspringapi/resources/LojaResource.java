package br.com.viniciusmargotti.javaspringapi.resources;

import br.com.viniciusmargotti.javaspringapi.models.Loja;
import br.com.viniciusmargotti.javaspringapi.repository.LojaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
