package com.coarf.plantilla_backend.model.repository;

import com.coarf.plantilla_backend.model.entity.Plantilla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlantillaRepository extends JpaRepository<Plantilla, Long> {
}
