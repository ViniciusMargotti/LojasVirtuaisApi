package br.com.viniciusmargotti.javaspringapi.dtos;

import br.com.viniciusmargotti.javaspringapi.models.Estado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class CidadeDTO implements Serializable {

    private Long id;
    private String nome;
    private Integer codigo_ibge ;
    private EstadoDTO estado;

    public CidadeDTO() {
    }
}
