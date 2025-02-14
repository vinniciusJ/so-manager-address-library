package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.LocationDTO;
import br.unioste.esi.so_manager.address_lib.domains.dtos.LocationTypeDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.Location;
import br.unioste.esi.so_manager.address_lib.domains.entities.LocationType;

public class LocationMapper {
    private LocationMapper() {}

    public static Location convertDTOToEntity(LocationDTO location) {
        LocationType locationType = LocationTypeMapper.convertDTOToEntity(location.getLocationType());

        return Location
                .builder()
                .name(location.getName())
                .locationType(locationType)
                .build();
    }

    public static LocationDTO convertEntityToDTO(Location location) {
        LocationTypeDTO locationType = LocationTypeMapper.convertEntityToDTO(location.getLocationType());

        return LocationDTO
                .builder()
                .id(location.getId())
                .name(location.getName())
                .locationType(locationType)
                .build();
    }

    public static LocationDTO convertExternalAddressToDTO(String name){
        return LocationDTO.builder().name(name).build();
    }
}
