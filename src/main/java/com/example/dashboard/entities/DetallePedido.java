package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido extends Base{
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private Double subTotal;

    @OneToMany(mappedBy = "detallePedido", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sucursal> articulo;

    @OneToMany(mappedBy = "detallePedido", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sucursal> pedido;
}
