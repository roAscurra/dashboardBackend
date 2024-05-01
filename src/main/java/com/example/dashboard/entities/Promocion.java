package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Promocion extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "FechaDesde")
    private LocalDate FechaDesde;
    @Column(name = "FechaHasta")
    private LocalDate FechaHasta;
    @Column(name = "HoraDesde")
    private LocalTime HoraDesde;
    @Column(name = "HoraHasta")
    private LocalTime HoraHasta;
    @Column(name = "descripcionDescuento")
    private String descripcionDescuento;
    @Column(name = "precioPromocional")
    private Double precioPromocional;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoPromocion")
    private TipoPromocion tipoPromocion;

    public enum TipoPromocion {
        DESCUENTO,
        REGALO,
        ENVIO_GRATIS,
        OTRO
    }

    @OneToMany(mappedBy = "promocion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ImagenPromocion> imagenPromociones;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;
}
