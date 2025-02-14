package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.NeighborhoodDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.Neighborhood;

public class NeighborhoodMapper {
    private NeighborhoodMapper() {}

    public static Neighborhood convertDTOToEntity(NeighborhoodDTO neighborhood){
        return Neighborhood
                .builder()
                .name(neighborhood.getName())
                .build();
    }

    public static NeighborhoodDTO convertEntityToDTO(Neighborhood neighborhood){
        return NeighborhoodDTO
                .builder()
                .id(neighborhood.getId())
                .name(neighborhood.getName())
                .build();
    }

    public static NeighborhoodDTO convertExternalAddressToDTO(String name){
        return NeighborhoodDTO.builder().name(name).build();
    }
}
