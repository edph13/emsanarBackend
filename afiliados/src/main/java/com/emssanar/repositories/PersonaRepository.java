package com.emssanar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emssanar.models.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
