package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Articulo extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioVenta")
    private Double precioVenta;
}
