package com.bae.financeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.PeopleBankAccount;

@Repository
public interface PeopleBankAccountRepository extends JpaRepository<PeopleBankAccount, Long> {

}
