package br.unioeste.esi.os.endereco.mappers;


import br.unioeste.esi.os.endereco.domains.dtos.*;
import br.unioeste.esi.os.endereco.domains.dtos.external.EnderecoExternoDTO;
import br.unioeste.esi.os.endereco.domains.dtos.forms.EnderecoFormDTO;
import br.unioeste.esi.os.endereco.domains.entities.Bairro;
import br.unioeste.esi.os.endereco.domains.entities.Cidade;
import br.unioeste.esi.os.endereco.domains.entities.Endereco;
import br.unioeste.esi.os.endereco.domains.entities.Logradouro;
import br.unioeste.esi.os.endereco.domains.dtos.*;

public class EnderecoMapper {
    private EnderecoMapper() {}

    public static EnderecoDTO converterEntidadeParaDTO(Endereco endereco) {
        BairroDTO bairro = BairroMapper.converterEntidadeParaDTO(endereco.getBairro());
        LogradouroDTO logradouro = LogradouroMapper.converterEntidadeParaDTO(endereco.getLogradouro());
        CidadeDTO cidade = CidadeMapper.converterEntidadeParaDTO(endereco.getCidade());

        return EnderecoDTO
                .builder()
                .id(endereco.getId())
                .cep(endereco.getCep())
                .cidade(cidade)
                .logradouro(logradouro)
                .bairro(bairro)
                .build();
    }

    public static Endereco converterDTOParaEntidade(EnderecoDTO address) {
        Bairro bairro = BairroMapper.converterDTOParaEntidade(address.getBairro());
        Logradouro logradouro = LogradouroMapper.converterDTOParaEntidade(address.getLogradouro());
        Cidade cidade = CidadeMapper.converterDTParaEntidade(address.getCidade());

        return Endereco
                .builder()
                .cep(address.getCep())
                .cidade(cidade)
                .logradouro(logradouro)
                .bairro(bairro)
                .build();
    }

    public static EnderecoDTO converterEnderecoExternoParaDTO(EnderecoExternoDTO externalAddress){
        BairroDTO bairro = BairroMapper.converterEnderecoExternoParaDTO(externalAddress.getBairro());
        LogradouroDTO logradouro = LogradouroMapper.converterEnderecoExternoParaDTO(externalAddress.getLogradouro());
        UnidadeFederativaDTO unidadeFederativa = UnidadeFederativaMapper.converterEnderecoExternoParaDTO(externalAddress.getUf(), externalAddress.getEstado());
        CidadeDTO cidade = CidadeMapper.converterEnderecoExternoParaDTO(externalAddress.getLocalidade(), unidadeFederativa);

        return EnderecoDTO
                .builder()
                .cep(externalAddress.getCep())
                .cidade(cidade)
                .logradouro(logradouro)
                .bairro(bairro)
                .build();
    }

    public static Endereco converterFormParaDTO(EnderecoFormDTO addressForm,
                                                Bairro bairro,
                                                Logradouro logradouro,
                                                Cidade cidade) {
        return Endereco.builder()
                .cep(addressForm.getCep())
                .bairro(bairro)
                .logradouro(logradouro)
                .cidade(cidade)
                .build();
    }
}
