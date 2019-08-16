package com.bae.financeapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	private Long amount;

	public EposTransactions() {

	}

	public EposTransactions(Long eposId, Long bankCardNumber, Long payeeAccount, Date timeStamp, Long amount) {
		this.eposId = eposId;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.timeStamp = timeStamp;
		this.amount = amount;
	}
}