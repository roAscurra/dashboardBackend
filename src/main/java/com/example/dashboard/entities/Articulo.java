package com.example.dashboard.entities;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Articulo extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioVenta")
    private Double precioVenta;

    @OneToOne
    @JoinColumn(name = "articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
