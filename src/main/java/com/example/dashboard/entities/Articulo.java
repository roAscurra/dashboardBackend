package com.example.dashboard.entities;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Articulo extends Base {
    @Column(name = "denominacion")
    protected String denominacion;
    @Column(name = "precioVenta")
    protected Double precioVenta;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloInsumo articuloManufacturado;
//FIJARSE LAS FLECHAS DE ARTICULOMANUFACTURADO Y ARTICULOINSUMO QUE VAN A ARTICULO

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ImagenPromocion> imagenPromociones;

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetallePedido> detallePedidos;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;


}
