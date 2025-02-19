package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "federal_unit")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
@ToString
public class FederalUnit {
    @Id
    private String abbreviation;
    private String name;
}
