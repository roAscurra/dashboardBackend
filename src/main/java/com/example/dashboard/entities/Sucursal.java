package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Sucursal extends Base{
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horarioApertura")
    private LocalTime horarioApertura;
    @Column(name = "horarioCierre")
    private LocalTime horarioCierre;
}
