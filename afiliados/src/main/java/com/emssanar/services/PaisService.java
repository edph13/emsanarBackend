package com.emssanar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emssanar.models.Pais;
import com.emssanar.repositories.PaisRepository;


@Service
public class PaisService {
	

	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
		return paisRepository.findAll();
	}


}