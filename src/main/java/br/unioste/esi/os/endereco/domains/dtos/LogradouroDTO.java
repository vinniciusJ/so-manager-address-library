package br.unioste.esi.os.endereco.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class LogradouroDTO {
    private Long id;
    private String nome;
    private TipoLogradouroDTO tipoLogradouro;
}
