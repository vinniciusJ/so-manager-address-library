package br.unioste.esi.os.endereco.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cidade")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "sigla_unidade_federativa")
    private UnidadeFederativa unidadeFederativa;
}
