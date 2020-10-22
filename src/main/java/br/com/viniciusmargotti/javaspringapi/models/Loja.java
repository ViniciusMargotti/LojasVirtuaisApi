package br.com.viniciusmargotti.javaspringapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="LOJAS")
public class Loja implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull(message = "O campo nome é obrigatório")
    @Column(name = "NOME")
    private String nome;

    @NotNull(message = "O campo slogan é obrigatório")
    @Column(name = "SLOGAN")
    private String slogan;

    @NotNull(message = "O campo de identificação do cliente é obrigatório")
    @Column(name = "I_DATABASES")
    private Integer databases;

    public Loja() {
    }
}
