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

	private Long bankcardNumber;

	private Long payeeAccount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private Long amount;

	public EposTransactions() {

	}

	public EposTransactions(Long eposId, Long bankcardNumber, Long payeeAccount, Date timestamp, Long amount) {
		this.eposId = eposId;
		this.bankcardNumber = bankcardNumber;
		this.payeeAccount = payeeAccount;
		this.timestamp = timestamp;
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

	public Long getBankcardNumber() {
		return bankcardNumber;
	}

	public void setBankcardNumber(Long bankcardNumber) {
		this.bankcardNumber = bankcardNumber;
	}

	public Long getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(Long payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
}