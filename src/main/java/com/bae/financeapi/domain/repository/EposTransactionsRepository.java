package com.bae.financeapi.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.model.EposTransactions;
import com.bae.financeapi.dto.TransactionsDTO;

@Repository
public interface EposTransactionsRepository extends JpaRepository<EposTransactions, Long> {

	@Query("SELECT NEW com.bae.financeapi.dto.TransactionsDTO(e.timestamp, e.amount, e.eposId.vendor, e.eposId.streetName, e.eposId.latitude, e.eposId.longitude, e.bankcardNumber.accountNumber.accountNumber) FROM EposTransactions e where "
			+ "e.bankcardNumber.accountNumber.accountNumber = ?1")
	List<TransactionsDTO> findAllEposTransactions(String accountNumber);
}