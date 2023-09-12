package com.coarf.plantilla_backend.infrastructure.ports.out;

import com.coarf.plantilla_backend.infrastructure.adapters.out.database.entities.PlantillaEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IPlantillaService {
    ResponseEntity<List<PlantillaEntity>> getAllPlantillas();
    ResponseEntity<Optional<PlantillaEntity>> getPlantillaById(Long id);
    ResponseEntity<PlantillaEntity> savePlantillas(PlantillaEntity plantillaEntity);
    ResponseEntity<PlantillaEntity> updatePlantillas(PlantillaEntity plantillaEntity, Long id);

}
