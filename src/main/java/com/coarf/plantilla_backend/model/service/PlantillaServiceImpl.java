package com.coarf.plantilla_backend.model.service;

import com.coarf.plantilla_backend.model.entity.Plantilla;
import com.coarf.plantilla_backend.model.repository.IPlantillaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlantillaServiceImpl implements IPlantillaService{

    private IPlantillaRepository plantillaRepository;
    @Override
    public ResponseEntity<List<Plantilla>> getAllPlantillas() {
        try {
            List<Plantilla> plantillas;
            plantillas = plantillaRepository.findAll();
            return new ResponseEntity<>(plantillas, HttpStatus.OK );
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ResponseEntity<Optional<Plantilla>> getPlantillaById(Long id) {
        Optional<Plantilla> plantillaOptional;
        try {
            plantillaOptional = plantillaRepository.findById(id);
            if (plantillaOptional.isPresent())
                return new ResponseEntity<>(plantillaOptional, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Plantilla> savePlantillas(Plantilla plantilla) {
        try {
            Plantilla plantillaGuardada = plantillaRepository.save(plantilla);
            return new ResponseEntity<>(plantillaGuardada,HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @Transactional
    public ResponseEntity<Plantilla> updatePlantillas(Plantilla plantilla, Long id) {
        try {
            Optional<Plantilla> plantillaOptional = plantillaRepository.findById(id);
            if (plantillaOptional.isPresent()){
                plantillaOptional.get().setNombre(plantilla.getNombre());
                plantillaOptional.get().setContenido(plantilla.getContenido());
                plantillaOptional.get().setFechaCreacion(plantilla.getFechaCreacion());
                Plantilla plantillaActualizada = plantillaRepository.save(plantillaOptional.get());
                return new ResponseEntity<>(plantillaActualizada, HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
