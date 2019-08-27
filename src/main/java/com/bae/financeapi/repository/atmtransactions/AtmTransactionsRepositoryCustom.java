package com.bae.financeapi.repository.atmtransactions;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.DTO.TransactionsDTO;

@Repository
public interface AtmTransactionsRepositoryCustom {

	List<TransactionsDTO> getTransactionsDTO(String accountNumber);
}