package com.coarf.plantilla_backend.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Plantilla {
    private Long id;
    private String nombre;
    private String contenido;
    private Date fechaCreacion;
}
