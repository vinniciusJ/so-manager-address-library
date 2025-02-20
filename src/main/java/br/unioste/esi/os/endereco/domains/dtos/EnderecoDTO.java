package br.unioste.esi.os.endereco.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class EnderecoDTO {
    private Long id;
    private String cep;
    private BairroDTO bairro;
    private LogradouroDTO logradouro;
    private CidadeDTO cidade;
}
