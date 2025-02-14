package br.unioste.esi.so_manager.address_lib.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class FederalUnitDTO {
    private String abbreviation;
    private String name;
}
