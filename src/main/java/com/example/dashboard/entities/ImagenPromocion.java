package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "imagenPromocion")
    private Promocion promocion;
}
