package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Imagen extends Base{
    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}
