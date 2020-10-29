package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
public class PessoaDTO implements Serializable {


    private Long id;

    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;

    @NotBlank(message = "O campo sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "O campo endereco é obrigatório")
    private String endereco;

    @NotBlank(message = "O campo cep é obrigatório")
    private String cep;

    @NotBlank(message = "O campo numero é obrigatório")
    private String numero;

    @NotBlank(message = "O campo complemento é obrigatório")
    private String complemento;

    @NotBlank(message = "O campo referencia é obrigatório")
    private String referencia;

    @Valid
    private BairroDTO bairro;

    public PessoaDTO() {
    }
}
