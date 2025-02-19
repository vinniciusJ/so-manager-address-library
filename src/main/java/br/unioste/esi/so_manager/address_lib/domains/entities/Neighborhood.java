package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "neighborhood")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
@ToString
public class Neighborhood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
