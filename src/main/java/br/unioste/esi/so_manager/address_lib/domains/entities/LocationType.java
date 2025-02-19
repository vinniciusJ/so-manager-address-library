package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "location_type")
@NoArgsConstructor @AllArgsConstructor
@Data @Builder
@ToString
public class LocationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}