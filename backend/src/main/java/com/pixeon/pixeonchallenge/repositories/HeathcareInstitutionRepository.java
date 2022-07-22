package com.pixeon.pixeonchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeathcareInstitutionRepository<cnpj> extends JpaRepository<cnpj, Long> {

}
