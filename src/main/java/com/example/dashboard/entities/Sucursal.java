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
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
    joinColumns = @JoinColumn(name = "sucursal_id"),
    inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    private List<Promocion> promociones;

    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pedido> pedidos;

    @OneToOne
    private Domicilio domicilio;
}
