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
@Inheritance(strategy = InheritanceType.JOINED)
public class Articulo extends Base{
    @Column(name = "denominacion")
    protected String denominacion;
    @Column(name = "precioVenta")
    protected Double precioVenta;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

//FIJARSE LAS FLECHAS DE ARTICULOMANUFACTURADO Y ARTICULOINSUMO QUE VAN A ARTICULO

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ImagenPromocion> imagenPromociones;

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetallePedido> detallePedidos;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;
}
