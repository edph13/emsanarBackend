package com.emssanar.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emssanar.models.Departamento;
import com.emssanar.models.Eps;
import com.emssanar.models.Pais;
import com.emssanar.models.Persona;
import com.emssanar.services.DeptoService;
import com.emssanar.services.EpsService;
import com.emssanar.services.PaisService;
import com.emssanar.services.PersonaService;


@RestController
@RequestMapping("/emsannar")
public class RestControllerEmssanar {
	
	@Autowired
	private DeptoService estadoService;
	
	@Autowired
	private PaisService paisService;
	
	@Autowired
	private EpsService epsService;
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping ("/estado/{id}")
	private ResponseEntity<List<Departamento>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
		
	}
	
	@GetMapping("/pais")
	private ResponseEntity<List<Pais>> getAllPaises (){
		return ResponseEntity.ok(paisService.findAll());
	}
	@GetMapping("/eps")
	private ResponseEntity<List<Eps>> getAllEps (){
		return ResponseEntity.ok(epsService.findAll());
	}
	
	@GetMapping("/personas")
	private ResponseEntity<List<Persona>> getAllPersonas (){
		return ResponseEntity.ok(personaService.findAll());
	}
	
	@PostMapping("/guardar")
	private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
		try {
			Persona personaGuardada = personaService.save(persona);		
		return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		return ResponseEntity.ok(personaService.deleteById(id));
	}

}
