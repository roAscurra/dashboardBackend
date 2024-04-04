package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria extends Base{
    @Column(name = "nombre")
    private String nombre;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Empresa> empresas;
}
