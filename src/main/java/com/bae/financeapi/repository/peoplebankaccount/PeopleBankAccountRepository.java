package com.bae.financeapi.repository.peoplebankaccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.PeopleBankAccount;

@Repository
public interface PeopleBankAccountRepository
		extends JpaRepository<PeopleBankAccount, Long>, QueryByExampleExecutor<PeopleBankAccount> {

}