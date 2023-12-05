package com.emssanar.services;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emssanar.models.Departamento;
import com.emssanar.repositories.DeptoRepository;


@Service
public class DeptoService {

    @Autowired
    private DeptoRepository deptoRepository;

    public List<Departamento> findAll() {
        return deptoRepository.findAll();
    }

    public List<Departamento> findAllByCountry(Long countryId) {
        return deptoRepository.findAll().stream()
				.filter(departamento -> Objects.equals(departamento.getId(), countryId))
				.collect(Collectors.toList());
    }
}
