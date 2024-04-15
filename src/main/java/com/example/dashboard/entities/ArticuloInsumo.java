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
public class ArticuloInsumo extends Base{
    @Column
    private String denominacion;
    @Column
    private double precioCompra;
    @Column
    private double precioVenta;
    @Column
    private Boolean esParaElaborar;

    @ManyToOne
    @JoinColumn(name="unidad_medida_id")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name="imagen_insumo_id")
    private ImagenInsumo imagenInsumo;

    @ManyToOne
    @JoinColumn(name="categoria_articulo_id")
    private CategoriaArticulo categoriaArticulo;



}
