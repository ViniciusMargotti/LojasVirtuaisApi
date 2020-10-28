package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PessoaDTO implements Serializable {

    private Long id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String cep;
    private String numero;
    private String complemento;
    private String referencia;
    private BairroDTO bairro;

    public PessoaDTO() {
    }
}
