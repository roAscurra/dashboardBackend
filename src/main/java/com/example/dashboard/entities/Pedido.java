package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pedido extends Base{
    @Column(name = "horaEstimadaFinalizacion")
    private LocalTime horaEstimadaFinalizacion;
    @Column(name = "total")
    private Double total;
    @Column(name = "totalCosto")
    private Double totalCosto;
    @Column(name = "estado")
    private Enum estado;
    @Column(name = "formaPago")
    private Enum formaPago;
    @Column(name = "FechaPedido")
    private LocalDate FechaPedido;
}