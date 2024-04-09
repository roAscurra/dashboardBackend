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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Denominacion", length = 128)
    private String denominacion;
    @Column(name = "Telefono", length = 50)
    private String telefono;
    @Column(name = "HorarioDeAtencion", length = 256)
    private String horarioAtencion;
    @Column(name = "QuienesSomos", length = 1024)
    private String quienesSomos;
    @Column(name = "Latitud")
    private Double latitud;
    @Column(name = "Longitud")
    private Double longitud;
    @Column(name = "Domicilio", length = 256)
    private String domicilio;
    @Column(name = "Email", length = 75)
    private String email;

}
