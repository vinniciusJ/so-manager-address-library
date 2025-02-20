package br.unioste.esi.os.endereco.mappers;


import br.unioste.esi.os.endereco.domains.dtos.LogradouroDTO;
import br.unioste.esi.os.endereco.domains.dtos.TipoLogradouroDTO;
import br.unioste.esi.os.endereco.domains.entities.Logradouro;
import br.unioste.esi.os.endereco.domains.entities.TipoLogradouro;

public class LogradouroMapper {
    private LogradouroMapper() {}

    public static Logradouro converterDTOParaEntidade(LogradouroDTO logradouro) {
        TipoLogradouro tipoLogradouro = TipoLogradouroMapper.converterDTOParaEntidade(logradouro.getTipoLogradouro());

        return Logradouro
                .builder()
                .nome(logradouro.getNome())
                .tipoLogradouro(tipoLogradouro)
                .build();
    }

    public static LogradouroDTO converterEntidadeParaDTO(Logradouro logradouro) {
        TipoLogradouroDTO locationType = TipoLogradouroMapper.converterEntidadeParaDTO(logradouro.getTipoLogradouro());

        return LogradouroDTO
                .builder()
                .id(logradouro.getId())
                .nome(logradouro.getNome())
                .tipoLogradouro(locationType)
                .build();
    }

    public static LogradouroDTO converterEnderecoExternoParaDTO(String nome){
        return LogradouroDTO.builder().nome(nome).build();
    }
}
