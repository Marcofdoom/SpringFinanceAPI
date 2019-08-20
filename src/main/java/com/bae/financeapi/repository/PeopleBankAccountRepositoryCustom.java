package com.bae.financeapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.PeopleBankAccount;

@Repository
public interface PeopleBankAccountRepositoryCustom {

	public List<PeopleBankAccount> findFinance(String forenames, String surname, String homeAddress, Date dateOfBirth);
}