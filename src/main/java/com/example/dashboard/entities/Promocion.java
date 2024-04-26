package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
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
    @Column(name = "tipoPromocion")
    private Enum tipoPromocion;


}
