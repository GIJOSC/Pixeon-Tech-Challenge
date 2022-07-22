package com.pixeon.pixeonchallenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixeon.pixeonchallenge.entities.Exam;

@Service
public class HealthcareInstitutionService<HealthcareIntitutionRepository> {
	
	@Autowired
	private HealthcareIntitutionRepository repository;
	
	public List<Exam> findExam() {
		return null;		
	}
	
	public List<Exam> findById() {
		return null;
	}

}
