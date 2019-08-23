package com.bae.financeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.financeapi.model.DTO.TransactionsDTO;
import com.bae.financeapi.repository.AtmTransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	private AtmTransactionRepository repository;

	public TransactionServiceImpl(AtmTransactionRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<TransactionsDTO> getTransactionsDTO(String accountNumber) {
		return repository.getTransactionsDTO(accountNumber);
	}
}
