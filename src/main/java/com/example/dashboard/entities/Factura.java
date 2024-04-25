package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends Base{
    @Column(name = "fechaFacturacion")
    private LocalDate fechaFacturacion;
    @Column(name = "mpPaymentId")
    private Integer mpPaymentId;
    @Column(name = "mpMerchantOrderId")
    private Integer mpMerchantOrderId;
    @Column(name = "mpPreferenceId")
    private String mpPreferenceId;
    @Column(name = "mpPaymentType")
    private String mpPaymentType;
    @Column(name = "formaPago")
    private Enum formaPago;
    @Column(name = "totalVenta")
    private Double totalVenta;
}
