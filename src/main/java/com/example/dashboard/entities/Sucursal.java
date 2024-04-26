package com.example.dashboard.entities;

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
    @JoinColumn(name = "fk_empresa")
    private Empresa empresa;

    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
    joinColumns = @JoinColumn(name = "fk_sucursal"),
    inverseJoinColumns = @JoinColumn(name = "fk_promocion"))
    private List<Promocion> promociones;

    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "fk_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "fk_categoria"))
    private List<Categoria> categorias;
}
