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
public class Domicilio extends Base{
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "cp")
    private Integer cp;
    @Column(name = "piso")
    private Integer piso;
    @Column(name = "nroDpto")
    private Integer nroDpto;

    @ManyToOne
    @JoinColumn(name="localidad_id")
    private Localidad localidad;
}
