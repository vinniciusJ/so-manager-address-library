package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.LocationTypeDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.LocationType;

public class LocationTypeMapper {
    private LocationTypeMapper() {}

    public static LocationType convertDTOToEntity(LocationTypeDTO locationType){
        return LocationType
                .builder()
                .name(locationType.getName())
                .build();
    }

    public static LocationTypeDTO convertEntityToDTO(LocationType locationType){
        return LocationTypeDTO
                .builder()
                .id(locationType.getId())
                .name(locationType.getName())
                .build();
    }
}
