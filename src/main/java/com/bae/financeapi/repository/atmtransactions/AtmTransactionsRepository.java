package com.bae.financeapi.repository.atmtransactions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.AtmTransactions;

@Repository
public interface AtmTransactionsRepository extends JpaRepository<AtmTransactions, Long>, AtmTransactionsRepositoryCustom {

}