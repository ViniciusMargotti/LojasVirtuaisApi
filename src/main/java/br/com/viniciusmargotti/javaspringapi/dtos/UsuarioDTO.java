package br.com.viniciusmargotti.javaspringapi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String email;
    private String senha;
    private PessoaDTO pessoa;

    public UsuarioDTO() {
    }
}
