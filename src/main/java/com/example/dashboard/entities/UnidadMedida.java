package com.example.dashboard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnidadMedida extends Base {
    @Column
    private String denominacion;


}
