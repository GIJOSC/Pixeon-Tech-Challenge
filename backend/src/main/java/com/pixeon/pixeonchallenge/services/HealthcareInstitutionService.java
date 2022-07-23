package com.pixeon.pixeonchallenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixeon.pixeonchallenge.entities.HealthcareInstitution;
import com.pixeon.pixeonchallenge.repositories.HeathcareInstitutionRepository;

@Service
public class HealthcareInstitutionService {
	
	@Autowired
	private HeathcareInstitutionRepository repository;
	
	public List<HealthcareInstitution> findAll() {
		return repository.findAll();	
	}

}
