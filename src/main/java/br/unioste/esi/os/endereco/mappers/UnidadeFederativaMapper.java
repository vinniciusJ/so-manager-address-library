package br.unioste.esi.os.endereco.mappers;


import br.unioste.esi.os.endereco.domains.dtos.UnidadeFederativaDTO;
import br.unioste.esi.os.endereco.domains.entities.UnidadeFederativa;

public class UnidadeFederativaMapper {
    public static UnidadeFederativaDTO converterEntidadeParaDTO(UnidadeFederativa unidadeFederativa) {
        return UnidadeFederativaDTO
                .builder()
                .nome(unidadeFederativa.getNome())
                .sigla(unidadeFederativa.getSigla())
                .build();
    }

    public static UnidadeFederativa converterDTOParaEntidade(UnidadeFederativaDTO unidadeFederativa) {
        return UnidadeFederativa
                .builder()
                .nome(unidadeFederativa.getNome())
                .sigla(unidadeFederativa.getSigla())
                .build();
    }

    public static UnidadeFederativaDTO converterEnderecoExternoParaDTO(String sigla, String nome){
        return UnidadeFederativaDTO.builder().nome(nome).sigla(sigla).build();
    }
}
