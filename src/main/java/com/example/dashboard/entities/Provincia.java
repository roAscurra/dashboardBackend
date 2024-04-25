package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn (name="pais_id")
    private Pais pais;
}
