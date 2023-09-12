package com.coarf.plantilla_backend.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "campo")
public class Campo implements Serializable {
    @Serial
    private static final long serialVersionUID = 4861644800525868541L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contenido;
    private int posicionX;
    private int posicionY;
    private boolean negrita;
    private int tamanoFuente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Plantilla plantilla;
}
