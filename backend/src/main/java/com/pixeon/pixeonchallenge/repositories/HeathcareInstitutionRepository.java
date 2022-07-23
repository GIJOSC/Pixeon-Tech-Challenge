package com.pixeon.pixeonchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixeon.pixeonchallenge.entities.HealthcareInstitution;

@Repository
public interface HeathcareInstitutionRepository extends JpaRepository<HealthcareInstitution, Long> {

}
