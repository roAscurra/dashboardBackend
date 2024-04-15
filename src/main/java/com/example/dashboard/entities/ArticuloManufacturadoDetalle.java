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
public class ArticuloManufacturadoDetalle extends Base{
    @Column
    private double cantidad;

    @ManyToOne
    @JoinColumn(name="articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

}
