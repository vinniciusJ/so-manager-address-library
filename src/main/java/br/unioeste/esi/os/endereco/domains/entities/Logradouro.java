package br.unioeste.esi.os.endereco.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "logradouro")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class Logradouro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_tipo_logradouro")
    private TipoLogradouro tipoLogradouro;
}
