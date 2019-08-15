package com.bae.financeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.BankCard;

@Repository
public interface BankCardRepository extends JpaRepository<BankCard, Long> {

}