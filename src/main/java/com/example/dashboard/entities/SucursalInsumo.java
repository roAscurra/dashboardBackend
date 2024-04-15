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
public class SucursalInsumo extends Base {

    @Column
    private long stockActual;
    @Column
    private long stockMinimo;
    @Column
    private long stockMaximo;

    @ManyToOne
    @JoinColumn(name="articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name="sucursal_id")
    private Sucursal sucursal;

}
