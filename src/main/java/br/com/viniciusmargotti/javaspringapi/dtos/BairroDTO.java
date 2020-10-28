package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

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
