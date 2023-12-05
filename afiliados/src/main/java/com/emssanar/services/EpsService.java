package com.emssanar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emssanar.models.Eps;
import com.emssanar.repositories.EpsRepository;

public class EpsService {
	

	@Autowired
	private EpsRepository epsRepository;


	public List<Eps> findAll() {
		return epsRepository.findAll();
	}

}
