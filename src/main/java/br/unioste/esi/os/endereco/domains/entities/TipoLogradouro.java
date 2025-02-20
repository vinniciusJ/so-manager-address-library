package br.unioste.esi.os.endereco.domains.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_logradouro")
@NoArgsConstructor @AllArgsConstructor
@Data @Builder
public class TipoLogradouro {
    @Id
    private String sigla;

    private String nome;
}