package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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

}
