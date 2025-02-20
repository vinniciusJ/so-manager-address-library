package br.unioeste.esi.os.endereco.mappers;


import br.unioeste.esi.os.endereco.domains.dtos.TipoLogradouroDTO;
import br.unioeste.esi.os.endereco.domains.entities.TipoLogradouro;

public class TipoLogradouroMapper {
    private TipoLogradouroMapper() {}

    public static TipoLogradouro converterDTOParaEntidade(TipoLogradouroDTO tipoLogradouro){
        return TipoLogradouro
                .builder()
                .nome(tipoLogradouro.getNome())
                .build();
    }

    public static TipoLogradouroDTO converterEntidadeParaDTO(TipoLogradouro tipoLogradouro){
        return TipoLogradouroDTO
                .builder()
                .sigla(tipoLogradouro.getSigla())
                .nome(tipoLogradouro.getNome())
                .build();
    }
}
