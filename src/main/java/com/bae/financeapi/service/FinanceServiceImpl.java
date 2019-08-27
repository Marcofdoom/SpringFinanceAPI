package com.bae.financeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.bae.financeapi.model.PeopleBankAccount;
import com.bae.financeapi.repository.peoplebankaccount.PeopleBankAccountRepository;

@Service
public class FinanceServiceImpl implements FinanceService {

	private PeopleBankAccountRepository repository;

	@Autowired
	public FinanceServiceImpl(PeopleBankAccountRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<PeopleBankAccount> findPeopleBankAccount(PeopleBankAccount probe) {
		return repository.findAll(Example.of(probe, ExampleMatcher.matchingAll().withIgnoreCase()));
	}
}