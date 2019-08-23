package com.bae.financeapi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.DTO.TransactionsDTO;

@Repository
public interface AtmTransactionRepositoryCustom {
	List<TransactionsDTO> getTransactionsDTO(String accountNumber);

}
