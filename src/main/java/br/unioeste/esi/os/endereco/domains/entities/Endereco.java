
package br.unioeste.esi.os.endereco.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "id_logradouro")
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @Override
    public String toString() {
        return String.format("%s - %s, %s - %s, %s", logradouro.getNome(), bairro.getNome(), cidade.getNome(), cidade.getUnidadeFederativa().getSigla(), cep);
    }
}
