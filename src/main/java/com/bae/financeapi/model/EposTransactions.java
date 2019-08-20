package com.bae.financeapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getEposId() {
		return eposId;
	}

	public void setEposId(Long eposId) {
		this.eposId = eposId;
	}

	public Long getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(Long bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public Long getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(Long payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
}