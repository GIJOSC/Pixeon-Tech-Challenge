package com.pixeon.pixeonchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixeon.pixeonchallenge.entities.Exam;


@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

}
