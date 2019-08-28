package com.bae.financeapi.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.bae.financeapi.domain.dao.PeopleBankAccountDAO;
import com.bae.financeapi.domain.model.PeopleBankAccount;

@Service
public class FinanceService {

	private PeopleBankAccountDAO peopleBankAccountDao;

	public FinanceService(PeopleBankAccountDAO peopleBankAccountDao) {
		this.peopleBankAccountDao = peopleBankAccountDao;
	}

	public List<PeopleBankAccount> findAllAccountsByIdentity(PeopleBankAccount probe) {
		return peopleBankAccountDao
				.findAllAccountsByIdentity(Example.of(probe, ExampleMatcher.matchingAll().withIgnoreCase()));
	}
}