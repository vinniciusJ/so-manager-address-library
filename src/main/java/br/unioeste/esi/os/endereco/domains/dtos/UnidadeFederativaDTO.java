package br.unioeste.esi.os.endereco.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class UnidadeFederativaDTO {
    private String sigla;
    private String nome;
}
