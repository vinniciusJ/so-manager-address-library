package br.unioste.esi.os.endereco.mappers;


import br.unioste.esi.os.endereco.domains.dtos.CidadeDTO;
import br.unioste.esi.os.endereco.domains.dtos.UnidadeFederativaDTO;
import br.unioste.esi.os.endereco.domains.entities.Cidade;

public class CidadeMapper {
    private CidadeMapper(){}

    public static CidadeDTO converterEntidadeParaDTO(Cidade cidade){
        UnidadeFederativaDTO federalUnit = UnidadeFederativaMapper.converterEntidadeParaDTO(cidade.getUnidadeFederativa());

        return CidadeDTO
                .builder()
                .id(cidade.getId())
                .nome(cidade.getNome())
                .unidadeFederativa(federalUnit)
                .build();
    }

    public static Cidade converterDTParaEntidade(CidadeDTO cidade){
        return Cidade.builder().nome(cidade.getNome()).build();
    }

    public static CidadeDTO converterEnderecoExternoParaDTO(String nome, UnidadeFederativaDTO unidadeFederativa){
        return CidadeDTO.builder().nome(nome).unidadeFederativa(unidadeFederativa).build();
    }
}
