package com.bae.financeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.financeapi.domain.dao.AtmTransactionsDAO;
import com.bae.financeapi.domain.dao.EposTransactionsDAO;
import com.bae.financeapi.dto.TransactionType;
import com.bae.financeapi.dto.TransactionsDTO;

@Service
public class TransactionService {

	private AtmTransactionsDAO atmTransactionsDao;

	private EposTransactionsDAO eposTransactionsDao;

	@Autowired
	public TransactionService(AtmTransactionsDAO atmTransactionsDao, EposTransactionsDAO eposTransactionsDao) {
		this.atmTransactionsDao = atmTransactionsDao;
		this.eposTransactionsDao = eposTransactionsDao;
	}

	public List<TransactionsDTO> findAllTransactionsByIdentity(String accountNumber) {
		List<TransactionsDTO> atmTransactions = atmTransactionsDao.findAllAtmTransactions(accountNumber);
		atmTransactions.forEach(i -> i.setTransactionType(TransactionType.ATM));

		List<TransactionsDTO> eposTransactions = eposTransactionsDao.findAllEposTransactions(accountNumber);
		eposTransactions.forEach(i -> i.setTransactionType(TransactionType.EPOS));

		atmTransactions.addAll(eposTransactions);
		return atmTransactions;
	};
}