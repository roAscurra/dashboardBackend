package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ArticuloInsumo extends Articulo{

    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "stockActual")
    private Integer stockActual;
    @Column(name = "stockMaximo")
    private Integer stockMaximo;
    @Column(name = "esParaElaborar")
    private Boolean esParaElaborar;



    @OneToMany(mappedBy = "articuloInsumo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new ArrayList<>();
}
