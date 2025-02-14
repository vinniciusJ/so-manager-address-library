
package br.unioste.esi.so_manager.address_lib.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "neighborhood_id")
    private Neighborhood neighborhood;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Override
    public String toString() {
        return String.format("%s - %s, %s - %s, %s", location.getName(), neighborhood.getName(), city.getName(), city.getFederalUnit().getAbbreviation(), zipCode);
    }
}
