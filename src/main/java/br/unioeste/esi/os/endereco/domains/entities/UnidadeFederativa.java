package br.unioeste.esi.os.endereco.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "unidade_federativa")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class UnidadeFederativa {
    @Id
    private String sigla;
    private String nome;
}
