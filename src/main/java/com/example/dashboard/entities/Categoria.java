package com.example.dashboard.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @Column(name = "denominacion")
    private String denominacion;

<<<<<<< Updated upstream
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sucursal> articulo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idSucursal")
    @JsonBackReference
    private Sucursal sucursal;


=======
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Sucursal> sucursales;

    @OneToMany()
    @JoinColumn(name = "articulo_id")
    @Builder.Default //Builder no sobreescribe la inicializacion de la lista
    private Set<Articulo> articulo = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
>>>>>>> Stashed changes
}
