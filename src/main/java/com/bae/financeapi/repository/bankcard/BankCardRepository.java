package com.bae.financeapi.repository.bankcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.Bankcard;

@Repository
public interface BankCardRepository extends JpaRepository<Bankcard, Long> {

}