package com.coarf.plantilla_backend.model.repository;

import com.coarf.plantilla_backend.model.entity.Campo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICampoRepository extends JpaRepository<Campo, Long> {
}
