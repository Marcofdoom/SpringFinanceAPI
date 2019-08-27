package com.bae.financeapi.domain.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.repository.EposTransactionsRepository;
import com.bae.financeapi.dto.TransactionsDTO;

@Repository
public class EposTransactionsDAO {

	private EposTransactionsRepository eposTransactionsRepository;

	@Autowired
	public EposTransactionsDAO(EposTransactionsRepository eposTransactionsRepository) {
		this.eposTransactionsRepository = eposTransactionsRepository;
	}

	public List<TransactionsDTO> findAllEposTransactions(String accountNumber) {
		return eposTransactionsRepository.findAllEposTransactions(accountNumber);
	}
}
