package com.alessandro.nutritech.domain.repository;

import com.alessandro.nutritech.domain.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
