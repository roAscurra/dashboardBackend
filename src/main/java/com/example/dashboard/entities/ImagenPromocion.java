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

    @OneToOne
    @JoinColumn(name = "imagenPromocion")
    private Promocion promocion;

    @OneToOne
    @JoinColumn(name = "articulo")
    private Articulo articulo;
}
