package com.bae.financeapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.model.AtmPoint;

@Repository
public interface AtmPointRepository extends JpaRepository<AtmPoint, Long> {

}