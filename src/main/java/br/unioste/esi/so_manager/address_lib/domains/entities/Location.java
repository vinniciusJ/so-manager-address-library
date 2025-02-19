package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "location")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
@ToString
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "location_type_id")
    private LocationType locationType;
}
