package br.unioste.esi.so_manager.address_lib.mappers;


import br.unioste.esi.so_manager.address_lib.domains.dtos.*;
import br.unioste.esi.so_manager.address_lib.domains.dtos.external.ExternalAddressDTO;
import br.unioste.esi.so_manager.address_lib.domains.dtos.forms.AddressFormDTO;
import br.unioste.esi.so_manager.address_lib.domains.entities.Address;
import br.unioste.esi.so_manager.address_lib.domains.entities.City;
import br.unioste.esi.so_manager.address_lib.domains.entities.Location;
import br.unioste.esi.so_manager.address_lib.domains.entities.Neighborhood;

public class AddressMapper {
    private AddressMapper() {}

    public static AddressDTO convertEntityToDTO(Address address) {
        NeighborhoodDTO neighborhood = NeighborhoodMapper.convertEntityToDTO(address.getNeighborhood());
        LocationDTO location = LocationMapper.convertEntityToDTO(address.getLocation());
        CityDTO city = CityMapper.convertEntityToDTO(address.getCity());

        return AddressDTO
                .builder()
                .id(address.getId())
                .zipCode(address.getZipCode())
                .city(city)
                .location(location)
                .neighborhood(neighborhood)
                .build();
    }

    public static Address convertDTOToEntity(AddressDTO address) {
        Neighborhood neighborhood = NeighborhoodMapper.convertDTOToEntity(address.getNeighborhood());
        Location location = LocationMapper.convertDTOToEntity(address.getLocation());
        City city = CityMapper.convertDTOToEntity(address.getCity());

        return Address
                .builder()
                .zipCode(address.getZipCode())
                .city(city)
                .location(location)
                .neighborhood(neighborhood)
                .build();
    }

    public static AddressDTO convertExternalAddressDTO(ExternalAddressDTO externalAddress){
        NeighborhoodDTO neighborhood = NeighborhoodMapper.convertExternalAddressToDTO(externalAddress.getBairro());
        LocationDTO location = LocationMapper.convertExternalAddressToDTO(externalAddress.getLogradouro());
        FederalUnitDTO federalUnit = FederalUnitMapper.convertExternalAddressToDTO(externalAddress.getUf(), externalAddress.getEstado());
        CityDTO city = CityMapper.convertExternalAddressToDTO(externalAddress.getLocalidade(), federalUnit);

        return AddressDTO
                .builder()
                .zipCode(externalAddress.getCep())
                .city(city)
                .location(location)
                .neighborhood(neighborhood)
                .build();
    }

    public static Address convertFormDTOToEntity(AddressFormDTO addressForm,
                                                 Neighborhood neighborhood,
                                                 Location location,
                                                 City city) {
        return Address.builder()
                .zipCode(addressForm.getZipCode())
                .neighborhood(neighborhood)
                .location(location)
                .city(city)
                .build();
    }
}
