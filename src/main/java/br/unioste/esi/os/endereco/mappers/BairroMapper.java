package br.unioste.esi.os.endereco.mappers;


import br.unioste.esi.os.endereco.domains.dtos.BairroDTO;
import br.unioste.esi.os.endereco.domains.entities.Bairro;

public class BairroMapper {
    private BairroMapper() {}

    public static Bairro converterDTOParaEntidade(BairroDTO bairro){
        return Bairro
                .builder()
                .nome(bairro.getNome())
                .build();
    }

    public static BairroDTO converterEntidadeParaDTO(Bairro bairro){
        return BairroDTO
                .builder()
                .id(bairro.getId())
                .nome(bairro.getNome())
                .build();
    }

    public static BairroDTO converterEnderecoExternoParaDTO(String name){
        return BairroDTO.builder().nome(name).build();
    }
}
