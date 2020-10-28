package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @NotNull(message = "O campo email é obrigatório")
    private String email;
    @NotNull(message = "O campo senha é obrigatório")
    private String senha;
    @NotNull(message = "O usuário deve estar vinculado a uma pessoa")
    private PessoaDTO pessoa;

    public UsuarioDTO() {
    }
}
