package com.bae.financeapi.domain.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.repository.AtmTransactionsRepository;
import com.bae.financeapi.dto.TransactionsDTO;

@Repository
public class AtmTransactionsDAO {

	private AtmTransactionsRepository atmTransactionsRepository;

	@Autowired
	public AtmTransactionsDAO(AtmTransactionsRepository atmTransactionsRepository) {
		this.atmTransactionsRepository = atmTransactionsRepository;
	}

	public List<TransactionsDTO> findAllAtmTransactions(String accountNumber) {
		return atmTransactionsRepository.findAllAtmTransactions(accountNumber);
	}
}