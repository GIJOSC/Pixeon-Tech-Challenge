package com.pixeon.pixeonchallenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixeon.pixeonchallenge.entities.Exam;
import com.pixeon.pixeonchallenge.repositories.ExamRepository;

@Service
public class ExamService {
	
	@Autowired
	private ExamRepository repository;
	
	public List<Exam> findExam() {
		return repository.findAllById(null);
		
	}

}
