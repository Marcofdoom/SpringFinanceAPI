package com.bae.financeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.financeapi.model.PeopleBankAccount;

@Service
public interface FinanceService {

	public List<PeopleBankAccount> findPeopleBankAccount(PeopleBankAccount peopleBankAccount);
}