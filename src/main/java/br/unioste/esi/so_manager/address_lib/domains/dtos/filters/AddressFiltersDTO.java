package br.unioste.esi.so_manager.address_lib.domains.dtos.filters;

public record AddressFiltersDTO(
        String zipCode,
        String locationName,
        String neighborhoodName,
        String cityName,
        String federalUnitName
){

}