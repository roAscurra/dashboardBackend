package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ArticuloManufacturadoDetalle  extends Base{
    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="articulo_insumo")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
