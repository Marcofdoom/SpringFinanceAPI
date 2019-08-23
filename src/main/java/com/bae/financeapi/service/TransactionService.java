package com.bae.financeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.financeapi.model.DTO.TransactionsDTO;

@Service
public interface TransactionService {

	List<TransactionsDTO> getTransactionsDTO(String accountNumber);

}
