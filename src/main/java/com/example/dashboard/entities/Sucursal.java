package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;
}
