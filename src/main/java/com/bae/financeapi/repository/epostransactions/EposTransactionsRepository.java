package com.bae.financeapi.repository.epostransactions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.EposTransactions;

@Repository
public interface EposTransactionsRepository extends JpaRepository<EposTransactions, Long>{

}
