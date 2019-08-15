package com.bae.financeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.Epos;

@Repository
public interface EposRepository extends JpaRepository<Epos, Long> {

}