package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "federal_unit_abbreviation")
    private FederalUnit federalUnit;
}
