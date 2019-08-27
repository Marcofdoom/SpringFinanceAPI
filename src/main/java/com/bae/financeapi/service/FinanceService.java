package com.bae.financeapi.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.bae.financeapi.domain.dao.PeopleBankAccountDao;
import com.bae.financeapi.domain.model.PeopleBankAccount;

@Service
public class FinanceService {

	private PeopleBankAccountDao peopleBankAccountDao;

	public FinanceService(PeopleBankAccountDao peopleBankAccountDao) {
		this.peopleBankAccountDao = peopleBankAccountDao;
	}

	public List<PeopleBankAccount> findAllAccountsByIdentity(PeopleBankAccount probe) {
		return peopleBankAccountDao
				.findAllAccountsByIdentity(Example.of(probe, ExampleMatcher.matchingAll().withIgnoreCase()));
	}
}