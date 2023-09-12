package com.coarf.plantilla_backend.infrastructure.adapters.out.database.repository;

import com.coarf.plantilla_backend.infrastructure.adapters.out.database.entities.PlantillaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlantillaRepository extends JpaRepository<PlantillaEntity, Long> {
}
