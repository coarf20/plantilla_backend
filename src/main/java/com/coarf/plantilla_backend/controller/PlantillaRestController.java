package com.coarf.plantilla_backend.controller;

import com.coarf.plantilla_backend.model.entity.Plantilla;
import com.coarf.plantilla_backend.model.service.IPlantillaService;
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
    public ResponseEntity<?> savePlantillas(@RequestBody Plantilla plantilla){
        return plantillaService.savePlantillas(plantilla);
    }

    @PutMapping("/plantilla/{id}")
    public ResponseEntity<?> updatePlantilla(@RequestBody Plantilla plantilla, @PathVariable Long id){
        return plantillaService.updatePlantillas(plantilla, id);
    }
}
