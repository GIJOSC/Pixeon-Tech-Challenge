package com.pixeon.pixeonchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeathcareInstitutionRepository<cnpj> extends JpaRepository<cnpj, Long> {

}
