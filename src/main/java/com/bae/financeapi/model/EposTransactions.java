package com.bae.financeapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class EposTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "epos_id")
	private EposPoint eposId;

	@ManyToOne
	@JoinColumn(name = "bankcard_number")
	private Bankcard bankcardNumber;

	private Long payeeAccount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private Float amount;

	public EposTransactions() {

	}

	public EposTransactions(EposPoint eposId, Bankcard bankcardNumber, Long payeeAccount, Date timestamp,
			Float amount) {
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

	public EposPoint getEposId() {
		return eposId;
	}

	public void setEposId(EposPoint eposId) {
		this.eposId = eposId;
	}

	public Bankcard getBankcardNumber() {
		return bankcardNumber;
	}

	public void setBankcardNumber(Bankcard bankcardNumber) {
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

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
}