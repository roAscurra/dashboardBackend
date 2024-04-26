package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

    @OneToOne
    @JoinColumn(name = "articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
