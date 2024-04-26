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

    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "stockActual")
    private Integer stockActual;
    @Column(name = "stockMaximo")
    private Integer stockMaximo;
    @Column(name = "esParaElaborar")
    private Boolean esParaElaborar;








}
