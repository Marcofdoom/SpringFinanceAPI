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
public class AtmTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "bankcard_number")
	private Bankcard bankcardNumber;

	@ManyToOne
	@JoinColumn(name = "atm_id")
	private AtmPoint atmId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private Float amount;

	private String type;

	public AtmTransactions() {

	}

	public AtmTransactions(Bankcard bankcardNumber, AtmPoint atmId, Date timestamp, Float amount, String type) {
		this.bankcardNumber = bankcardNumber;
		this.atmId = atmId;
		this.timestamp = timestamp;
		this.amount = amount;
		this.type = type;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Bankcard getBankcardNumber() {
		return bankcardNumber;
	}

	public void setBankcardNumber(Bankcard bankcardNumber) {
		this.bankcardNumber = bankcardNumber;
	}

	public AtmPoint getAtmId() {
		return atmId;
	}

	public void setAtmId(AtmPoint atmId) {
		this.atmId = atmId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}