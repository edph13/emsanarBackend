package com.emssanar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emssanar.models.Departamento;

public interface DeptoRepository extends JpaRepository<Departamento, Long> {

}
