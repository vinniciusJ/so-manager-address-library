package br.unioste.esi.os.endereco.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Builder @Data
public class CidadeDTO {
    private Long id;
    private String nome;
    private UnidadeFederativaDTO unidadeFederativa;
}
