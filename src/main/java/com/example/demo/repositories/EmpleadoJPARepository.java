package com.example.demo.repositories;

import com.example.demo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoJPARepository extends JpaRepository<Empleado, Integer> {
}
