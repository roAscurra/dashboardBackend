package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticuloManufacturado extends Base{
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempoEstimadoMinutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    @OneToMany
    @JoinColumn(name="articulo_manufacturado_detalle")
    private ArticuloManufacturadoDetalle articuloManufacturadoDetalle;

    @OneToMany
    @JoinColumn(name="articulo")
    private Articulo articulo;


}
