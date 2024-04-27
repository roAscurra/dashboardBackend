package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImagenPromocion extends Base{
    @Column(name = "denominacion")
    private String denominacion;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}
