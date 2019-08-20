package com.bae.financeapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
public class AtmTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private Long bankCardNumber;

	private Long atmId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	private Integer amount;

	private String type;

	public AtmTransaction() {

	}

	public AtmTransaction(Long bankCardNumber, Long atmId, Date timeStamp, Integer amount, String type) {
		this.bankCardNumber = bankCardNumber;
		this.atmId = atmId;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.type = type;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(Long bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public Long getAtmId() {
		return atmId;
	}

	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}