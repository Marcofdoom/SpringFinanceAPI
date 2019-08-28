package com.bae.financeapi.domain.dao;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.domain.model.PeopleBankAccount;
import com.bae.financeapi.domain.repository.PeopleBankAccountRepository;

@Repository
public class PeopleBankAccountDAO {

	private PeopleBankAccountRepository peopleBankAccountRepository;

	public PeopleBankAccountDAO(PeopleBankAccountRepository peopleBankAccountRepository) {
		this.peopleBankAccountRepository = peopleBankAccountRepository;
	}

	public List<PeopleBankAccount> findAllAccountsByIdentity(Example<PeopleBankAccount> peopleBankAccount) {
		return peopleBankAccountRepository.findAll(peopleBankAccount);
	}
}