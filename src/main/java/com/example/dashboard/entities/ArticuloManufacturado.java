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
public class ArticuloManufacturado extends Base{
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempoEstimadoMinutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    @ManyToOne
    @JoinColumn(name="articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

}
