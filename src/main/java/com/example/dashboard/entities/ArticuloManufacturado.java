package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ArticuloManufacturado extends Articulo{
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempoEstimadoMinutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    @OneToMany(mappedBy = "articuloManufacturado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
}
