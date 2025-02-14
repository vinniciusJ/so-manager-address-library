package br.unioste.esi.so_manager.address_lib.domains.dtos.external;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ExternalAddressDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String bairro;
}
