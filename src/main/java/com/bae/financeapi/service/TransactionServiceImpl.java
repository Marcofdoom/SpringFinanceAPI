package com.bae.financeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.financeapi.model.DTO.TransactionsDTO;
import com.bae.financeapi.repository.atmtransactions.AtmTransactionsRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	private AtmTransactionsRepository repository;

	public TransactionServiceImpl(AtmTransactionsRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<TransactionsDTO> getTransactionsDTO(String accountNumber) {
		return repository.getTransactionsDTO(accountNumber);
	}
}