package com.coarf.plantilla_backend.infrastructure.ports.in;

import com.coarf.plantilla_backend.infrastructure.adapters.out.database.entities.PlantillaEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

@FunctionalInterface
public interface IGetAllPlantillas {
    ResponseEntity<List<PlantillaEntity>> getAllPlantillas();
}
