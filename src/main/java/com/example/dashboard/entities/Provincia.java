package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Provincia extends Base{
    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name="pais_id")
    private Pais pais;
}
