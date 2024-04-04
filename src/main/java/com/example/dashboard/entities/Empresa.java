package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empresa extends Base{
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "razonSocial")
    private String razonSocial;
    @Column(name = "cuil")
    private int cuil;
    @Column(name = "telefono")
    private int telefono;
}
