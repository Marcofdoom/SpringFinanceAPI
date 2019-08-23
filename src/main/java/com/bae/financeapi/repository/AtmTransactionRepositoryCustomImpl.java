package com.bae.financeapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.DTO.TransactionsDTO;
import com.bae.financeapi.util.TransactionType;

@Repository
public class AtmTransactionRepositoryCustomImpl implements AtmTransactionRepositoryCustom {

	private EntityManager entityManager;

	@Autowired
	public AtmTransactionRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<TransactionsDTO> getTransactionsDTO(String accountNumber) {
		TypedQuery<TransactionsDTO> queryAtm = entityManager.createQuery(
				"SELECT NEW com.bae.financeapi.model.DTO.TransactionsDTO(a.timestamp, a.amount, a.atmId.operator, a.atmId.streetName, a.atmId.latitude, a.atmId.longitude, a.bankcardNumber.accountNumber.accountNumber) FROM AtmTransactions a where "
						+ "a.bankcardNumber.accountNumber.accountNumber = :accountNumber",
				TransactionsDTO.class).setParameter("accountNumber", accountNumber);

		TypedQuery<TransactionsDTO> queryEpos = entityManager.createQuery(
				"SELECT NEW com.bae.financeapi.model.DTO.TransactionsDTO(e.timestamp, e.amount, e.eposId.vendor, e.eposId.streetName, e.eposId.latitude, e.eposId.longitude, e.bankcardNumber.accountNumber.accountNumber) FROM EposTransactions e where "
						+ "e.bankcardNumber.accountNumber.accountNumber = :accountNumber",
				TransactionsDTO.class).setParameter("accountNumber", accountNumber);

		List<TransactionsDTO> query1 = queryAtm.getResultList();
		query1.stream().forEach(i -> i.setType(TransactionType.ATM));
		List<TransactionsDTO> query2 = queryEpos.getResultList();
		query2.stream().forEach(i -> i.setType(TransactionType.EPOS));
		query1.addAll(query2);
		return query1;
	}

//	@Override
//	public List<MobileCallRecordsDTO> getMobileCallRecordsDTO(String phoneNumber) {
//
//		TypedQuery<MobileCallRecordsDTO> queryCaller = entityManager
//				.createQuery("SELECT NEW com.bae.mobileapi.model.DTO.MobileCallRecordsDTO("
//						+ "p.receiverMsisdn.forenames, p.receiverMsisdn.surname, p.receiverMsisdn.address,"
//						+ "p.receiverMsisdn.dateOfBirth, p.timestamp) FROM MobileCallRecords p where "
//						+ "p.callerMsisdn.phoneNumber = :phoneNumber", MobileCallRecordsDTO.class)
//				.setParameter("phoneNumber", phoneNumber);
//
//		TypedQuery<MobileCallRecordsDTO> queryReceiver = entityManager
//				.createQuery("SELECT NEW com.bae.mobileapi.model.DTO.MobileCallRecordsDTO("
//						+ "p.callerMsisdn.forenames, p.callerMsisdn.surname, p.callerMsisdn.address,"
//						+ "p.callerMsisdn.dateOfBirth, p.timestamp) FROM MobileCallRecords p where "
//						+ "p.receiverMsisdn.phoneNumber = :phoneNumber", MobileCallRecordsDTO.class)
//				.setParameter("phoneNumber", phoneNumber);
//
//		List<MobileCallRecordsDTO> queryCallers = queryCaller.getResultList();
//		List<MobileCallRecordsDTO> queryReceivers = queryReceiver.getResultList();
//
//		queryCallers.stream().forEach(i -> i.setCallType(CallType.CALLED));
//		queryReceivers.stream().forEach(i -> i.setCallType(CallType.RECEIVED));
//
//		queryCallers.addAll(queryReceivers);
//
//		return queryCallers;
//	}

}
