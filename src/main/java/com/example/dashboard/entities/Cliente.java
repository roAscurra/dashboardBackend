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
public class Cliente extends Base{
    @Column(name = "nombre")
    private String nombre;
    @Column(name ="apellido")
    private String apellido;
    @Column(name ="telefono")
    private String telefono;
    @Column(name ="email")
    private String email;
    @Column(name ="fechaNacimiento")
    private LocalDate fechaNacimiento;

}
