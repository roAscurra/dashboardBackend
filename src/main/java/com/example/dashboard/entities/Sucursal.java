package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Sucursal extends Base{
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private int telefono;
}
