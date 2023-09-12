package com.coarf.plantilla_backend.infrastructure.adapters.out.database.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Data
public class PlantillaEntity implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String nombre;

    @NotNull
    @Column(nullable = false, columnDefinition = "JSON")
    private String contenido;  // Almacenará el contenido en formato JSON

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Serial
    private static final long serialVersionUID = -7318338052141506059L;
}
