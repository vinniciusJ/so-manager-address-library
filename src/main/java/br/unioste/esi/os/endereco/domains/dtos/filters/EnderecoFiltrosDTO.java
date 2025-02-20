package br.unioste.esi.os.endereco.domains.dtos.filters;

public record EnderecoFiltrosDTO(
        String cep,
        String nomeLogradouro,
        String nomeBairro,
        String nomeCidade,
        String nomeUnidadeFederativa
){

}