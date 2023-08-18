package com.coarf.plantilla_backend.model.service;

import com.coarf.plantilla_backend.model.entity.Plantilla;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IPlantillaService {
    ResponseEntity<List<Plantilla>> getAllPlantillas();
    ResponseEntity<Optional<Plantilla>> getPlantillaById(Long id);
    ResponseEntity<Plantilla> savePlantillas(Plantilla plantilla);
    ResponseEntity<Plantilla> updatePlantillas(Plantilla plantilla, Long id);

}
