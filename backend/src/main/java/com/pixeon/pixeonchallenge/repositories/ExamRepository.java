package com.pixeon.pixeonchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pixeon.pixeonchallenge.entities.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {

}
