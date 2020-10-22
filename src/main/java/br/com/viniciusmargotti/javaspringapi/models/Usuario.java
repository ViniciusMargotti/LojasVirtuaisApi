package br.com.viniciusmargotti.javaspringapi.models;

import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull(message = "O campo email é obrigatório")
    @Column(name = "EMAIL")
    private String email;

    @NotNull(message = "O campo senha é obrigatório")
    @Column(name = "SENHA")
    private String senha;

    @NotNull(message = "O usuário deve estar vinculado a uma pessoa")
    @ManyToOne
    @JoinColumn(name = "ID_PESSOAS")
    private Pessoa pessoa;

    @NotNull(message = "O campo de identificação do cliente é obrigatório")
    @Column(name = "I_DATABASES")
    private Integer databases;

    public Usuario() {
    }
}
