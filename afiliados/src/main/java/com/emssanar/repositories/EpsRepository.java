package com.emssanar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emssanar.models.Eps;

public interface EpsRepository extends JpaRepository<Eps, Long> {

}
