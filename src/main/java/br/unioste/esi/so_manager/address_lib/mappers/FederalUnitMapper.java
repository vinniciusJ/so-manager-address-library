package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.FederalUnitDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.FederalUnit;

public class FederalUnitMapper {
    public static FederalUnitDTO convertEntityToDTO(FederalUnit federalUnit) {
        return FederalUnitDTO
                .builder()
                .name(federalUnit.getName())
                .abbreviation(federalUnit.getAbbreviation())
                .build();
    }

    public static FederalUnit convertDTOToEntity(FederalUnitDTO state) {
        return FederalUnit
                .builder()
                .name(state.getName())
                .abbreviation(state.getAbbreviation())
                .build();
    }

    public static FederalUnitDTO convertExternalAddressToDTO(String abbreviation, String name){
        return FederalUnitDTO.builder().name(name).abbreviation(abbreviation).build();
    }
}
