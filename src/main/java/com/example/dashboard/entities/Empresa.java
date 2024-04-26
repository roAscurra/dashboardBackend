package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Empresa extends Base{
     @Column(name = "nombre")
    private String nombre;
    @Column(name = "razonSocial")
    private String razonSocial;
    @Column(name = "cuil")
    private int cuil;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sucursal> sucursales;

}
