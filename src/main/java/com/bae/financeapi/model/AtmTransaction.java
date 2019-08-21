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

	private Long bankcardNumber;

	private Long atmId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private Integer amount;

	private String type;

	public AtmTransaction() {

	}

	public AtmTransaction(Long bankcardNumber, Long atmId, Date timestamp, Integer amount, String type) {
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

	public Long getBankcardNumber() {
		return bankcardNumber;
	}

	public void setBankcardNumber(Long bankcardNumber) {
		this.bankcardNumber = bankcardNumber;
	}

	public Long getAtmId() {
		return atmId;
	}

	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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