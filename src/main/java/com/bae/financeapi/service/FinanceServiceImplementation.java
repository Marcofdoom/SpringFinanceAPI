package com.bae.financeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.financeapi.model.PeopleBankAccount;
import com.bae.financeapi.repository.PeopleBankAccountRepository;

@Service
public class FinanceServiceImplementation implements FinanceService {

	private PeopleBankAccountRepository peopleBankAccountRepository;

	@Autowired
	public FinanceServiceImplementation(PeopleBankAccountRepository peopleBankAccountRepository) {
		this.peopleBankAccountRepository = peopleBankAccountRepository;
	}

	@Override
	public List<PeopleBankAccount> getFiance(PeopleBankAccount peopleBankAccount) {

		return peopleBankAccountRepository.findFinance(peopleBankAccount.getForenames(), peopleBankAccount.getSurname(),
				peopleBankAccount.getHomeAddress(), peopleBankAccount.getDateOfBirth());
	}
}