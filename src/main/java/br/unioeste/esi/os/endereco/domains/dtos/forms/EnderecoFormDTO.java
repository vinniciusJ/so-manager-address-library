package br.unioeste.esi.os.endereco.domains.dtos.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class EnderecoFormDTO {
    private String cep;
    private Long idBairro;
    private Long idLogradouro;
    private Long idCidade;
}
