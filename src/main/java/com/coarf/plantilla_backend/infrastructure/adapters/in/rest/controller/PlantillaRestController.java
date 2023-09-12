package com.coarf.plantilla_backend.infrastructure.adapters.in.rest.controller;

import com.coarf.plantilla_backend.infrastructure.adapters.out.database.entities.PlantillaEntity;
import com.coarf.plantilla_backend.infrastructure.ports.out.IPlantillaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
@AllArgsConstructor
public class PlantillaRestController {

    private IPlantillaService plantillaService;

    @GetMapping("/plantillas")
    public ResponseEntity<?> getPlantillas(){
        return plantillaService.getAllPlantillas();
    }

    @GetMapping("/plantillas/{id}")
    public ResponseEntity<?> getPlantillaById(@PathVariable Long id){
        return plantillaService.getPlantillaById(id);
    }

    @PostMapping("/plantillas")
    public ResponseEntity<?> savePlantillas(@RequestBody PlantillaEntity plantillaEntity){
        return plantillaService.savePlantillas(plantillaEntity);
    }

    @PutMapping("/plantilla/{id}")
    public ResponseEntity<?> updatePlantilla(@RequestBody PlantillaEntity plantillaEntity, @PathVariable Long id){
        return plantillaService.updatePlantillas(plantillaEntity, id);
    }
}
