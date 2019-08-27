package com.bae.financeapi.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.model.AtmTransactions;
import com.bae.financeapi.dto.TransactionsDTO;

@Repository
public interface AtmTransactionsRepository extends JpaRepository<AtmTransactions, Long> {

	@Query("SELECT NEW com.bae.financeapi.dto.TransactionsDTO(a.timestamp, a.amount, a.atmId.operator, a.atmId.streetName, a.atmId.latitude, a.atmId.longitude, a.bankcardNumber.accountNumber.accountNumber) FROM AtmTransactions a where "
			+ "a.bankcardNumber.accountNumber.accountNumber = ?1")
	List<TransactionsDTO> findAllAtmTransactions(String accountNumber);
}