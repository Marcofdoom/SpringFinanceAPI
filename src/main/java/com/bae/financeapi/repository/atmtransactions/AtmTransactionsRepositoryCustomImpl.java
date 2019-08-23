package com.bae.financeapi.repository.atmtransactions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.DTO.TransactionsDTO;
import com.bae.financeapi.util.TransactionType;

@Repository
public class AtmTransactionsRepositoryCustomImpl implements AtmTransactionsRepositoryCustom {

	private String atmTransactionQuery = "SELECT NEW com.bae.financeapi.model.DTO.TransactionsDTO(a.timestamp, a.amount, a.atmId.operator, a.atmId.streetName, a.atmId.latitude, a.atmId.longitude, a.bankcardNumber.accountNumber.accountNumber) FROM AtmTransactions a where "
			+ "a.bankcardNumber.accountNumber.accountNumber = :accountNumber";

	private String eposTransactionQuery = "SELECT NEW com.bae.financeapi.model.DTO.TransactionsDTO(e.timestamp, e.amount, e.eposId.vendor, e.eposId.streetName, e.eposId.latitude, e.eposId.longitude, e.bankcardNumber.accountNumber.accountNumber) FROM EposTransactions e where "
			+ "e.bankcardNumber.accountNumber.accountNumber = :accountNumber";

	private EntityManager entityManager;

	@Autowired
	public AtmTransactionsRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<TransactionsDTO> getTransactionsDTO(String accountNumber) {
		TypedQuery<TransactionsDTO> queryAtm = entityManager.createQuery(atmTransactionQuery, TransactionsDTO.class)
				.setParameter("accountNumber", accountNumber);

		TypedQuery<TransactionsDTO> queryEpos = entityManager.createQuery(eposTransactionQuery, TransactionsDTO.class)
				.setParameter("accountNumber", accountNumber);

		List<TransactionsDTO> query1 = queryAtm.getResultList();
		query1.stream().forEach(i -> i.setType(TransactionType.ATM));

		List<TransactionsDTO> query2 = queryEpos.getResultList();
		query2.stream().forEach(i -> i.setType(TransactionType.EPOS));

		query1.addAll(query2);

		return query1;
	}
}