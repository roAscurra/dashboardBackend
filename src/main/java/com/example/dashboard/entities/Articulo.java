package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< Updated upstream
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
=======
import jakarta.persistence.MappedSuperClass;
>>>>>>> Stashed changes
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperClass
public class Articulo extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioVenta")
    private Double precioVenta;

    @OneToOne
    @JoinColumn(name = "articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
