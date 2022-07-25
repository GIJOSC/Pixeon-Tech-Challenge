package com.pixeon.pixeonchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pixeon.pixeonchallenge.entities.HealthcareInstitution;
import com.pixeon.pixeonchallenge.services.HealthcareInstitutionService;

@Controller
@RequestMapping(value = "/healthcare")
public class HealthcareInstitutionController {

	@Autowired
	private HealthcareInstitutionService service;
	
	//private HeathcareInstitutionRepository repository;

	@GetMapping
	public ResponseEntity<List<HealthcareInstitution>> findAllHealthcare() {
		List<HealthcareInstitution> list = service.findAll();

		return ResponseEntity.ok(list);

	}
	
	//@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	//public HealthcareInstitution AddHealthcareInstitution(@RequestBody HealthcareInstitution healthcareIntitution) {
	//	return repository.save(healthcareIntitution);
	//}

}
