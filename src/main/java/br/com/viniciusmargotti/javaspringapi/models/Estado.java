package br.com.viniciusmargotti.javaspringapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="ESTADOS")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull(message = "O campo nome é obrigatório")
    @Column(name = "NOME")
    private String nome;

    @NotNull(message = "O campo sigla é obrigatório")
    @Column(name = "SIGLA")
    private String sigla;

    public Estado() {
    }
}
