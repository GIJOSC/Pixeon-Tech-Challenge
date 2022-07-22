package com.pixeon.pixeonchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pixeon.pixeonchallenge.entities.Exam;
import com.pixeon.pixeonchallenge.services.HealthcareInstitutionService;

@RestController
@RequestMapping(value = "/healthcare")
public class HealthcareInstitutionController {
	
	@Autowired
	private HealthcareInstitutionService service;
	
	@GetMapping
	public List<Exam> findHealthcare() {
		return service.findById();
		
	}

}
