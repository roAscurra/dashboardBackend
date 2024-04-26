package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "articuloManufacturado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
}
