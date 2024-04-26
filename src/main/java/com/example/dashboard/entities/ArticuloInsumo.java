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
public class ArticuloInsumo extends Base{

    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "stockActual")
    private Integer stockActual;
    @Column(name = "stockMaximo")
    private Integer stockMaximo;
    @Column(name = "esParaElaborar")
    private Boolean esParaElaborar;

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Articulo> articulos;

    @OneToMany(mappedBy = "articuloManufacturaDetalle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;
}
