package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private ImagenCliente imagenCliente;

    @OneToMany
    @JoinColumn(name = "cliente_id")
    @Builder.Default //Builder no sobreescribe la inicializacion de la lista
    private Set<Pedido> pedidos = new HashSet<>();

    @ManyToMany
    //JoinTable crea una tabla intermedia
    @JoinTable  (name = "cliente_domicilio",
                joinColumns = @JoinColumn(name = "cliente_id"),
                inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();
}
