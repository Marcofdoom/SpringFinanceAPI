package com.bae.financeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.AtmTransaction;

@Repository
public interface AtmTransactionRepository extends JpaRepository<AtmTransaction, Long> {

}