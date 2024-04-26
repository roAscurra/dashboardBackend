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
@MappedSuperclass
public class Articulo extends Base{
    @Column(name = "denominacion")
    protected String denominacion;
    @Column(name = "precioVenta")
    protected Double precioVenta;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    @OneToMany(mappedBy = "promocion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ImagenPromocion> imagenPromociones;
}
