package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EposTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private Long eposId;

	private Long bankCardNumber;

	private Long payeeAccount;

	private String timeStamp;

	private Long amount;

	public EposTransactions() {

	}

	public EposTransactions(Long eposId, Long bankCardNumber, Long payeeAccount, String timeStamp, Long amount) {
		this.eposId = eposId;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.timeStamp = timeStamp;
		this.amount = amount;
	}
}