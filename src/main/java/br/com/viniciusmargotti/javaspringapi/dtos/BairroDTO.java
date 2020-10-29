package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class BairroDTO implements Serializable {

    @NotNull(message = "O bairro é obrigatorio")
    private Long id;

    private String nome;

    private CidadeDTO cidade;

    public BairroDTO() {
    }
}
