package com.coarf.plantilla_backend.model.service;

import com.coarf.plantilla_backend.model.entity.Campo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ICampoService {
    ResponseEntity<List<Campo>> getAllCampos();
    ResponseEntity<Optional<Campo>> getCampoById(Long id);
    ResponseEntity<Campo> saveCampo(Campo campo);
    ResponseEntity<Campo> updateCampo(Campo campo, Long id);
}
