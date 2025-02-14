package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.CityDTO;
import br.unioste.esi.so_manager.address_lib.domains.dtos.FederalUnitDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.City;

public class CityMapper {
    private CityMapper(){}

    public static CityDTO convertEntityToDTO(City city){
        FederalUnitDTO federalUnit = FederalUnitMapper.convertEntityToDTO(city.getFederalUnit());

        return CityDTO
                .builder()
                .id(city.getId())
                .name(city.getName())
                .federalUnit(federalUnit)
                .build();
    }

    public static City convertDTOToEntity(CityDTO cityDTO){
        return City.builder().name(cityDTO.getName()).build();
    }

    public static CityDTO convertExternalAddressToDTO(String name, FederalUnitDTO federalUnit){
        return CityDTO.builder().name(name).federalUnit(federalUnit).build();
    }
}
