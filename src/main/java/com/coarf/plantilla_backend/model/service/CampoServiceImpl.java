package com.coarf.plantilla_backend.model.service;

import com.coarf.plantilla_backend.model.entity.Campo;
import com.coarf.plantilla_backend.model.repository.ICampoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CampoServiceImpl implements ICampoService{
    private ICampoRepository campoRepository;
    @Override
    public ResponseEntity<List<Campo>> getAllCampos() {
        try{
            List<Campo> campos;
            campos = campoRepository.findAll();
            return new ResponseEntity<>(campos, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Optional<Campo>> getCampoById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Campo> saveCampo(Campo campo) {
        return null;
    }

    @Override
    public ResponseEntity<Campo> updateCampo(Campo campo, Long id) {
        return null;
    }
}
