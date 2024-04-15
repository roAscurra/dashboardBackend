package com.example.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaArticulo extends Base{
    @Column
    private String denominacion;

    @ManyToOne
    @JoinColumn(name="categoria_articulo_padre_id")
    private CategoriaArticulo categoriaArticuloPadre;

}
