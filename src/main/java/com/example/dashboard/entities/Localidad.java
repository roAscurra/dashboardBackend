package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends Base{
    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="provincia_id")
    private Provincia provincia;
}
