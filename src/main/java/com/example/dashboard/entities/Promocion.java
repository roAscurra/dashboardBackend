package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @ManyToMany
    @JoinTable(
            name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )
    private List<Sucursal> sucursales;
}
