package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="domicilio_id")
    private Domicilio domicilio;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="sucursal_id")
    private Sucursal sucursal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @OneToOne
    private Factura factura;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetallePedido> detallePedidos ;
//nullable false
}
