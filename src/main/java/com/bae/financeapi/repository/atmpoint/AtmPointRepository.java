package com.bae.financeapi.repository.atmpoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.AtmPoint;

@Repository
public interface AtmPointRepository extends JpaRepository<AtmPoint, Long> {

}