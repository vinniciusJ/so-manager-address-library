package br.unioste.esi.so_manager.address_lib.domains.dtos.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class AddressFormDTO {
    private String zipCode;
    private Long neighborhoodId;
    private Long locationId;
    private Long cityId;
}
