package br.com.viniciusmargotti.javaspringapi.dtos;

import br.com.viniciusmargotti.javaspringapi.models.Bairro;
import br.com.viniciusmargotti.javaspringapi.models.Cidade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class BairroDTO implements Serializable {

    private Long id;
    private String nome;
    private CidadeDTO cidade;

    public BairroDTO() {
    }
}
