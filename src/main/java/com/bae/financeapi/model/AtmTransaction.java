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
public class AtmTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private Long bankCardNumber;

	private Long atmId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	private int amount;

	private String type;

	public AtmTransaction() {

	}

	public AtmTransaction(Long bankCardNumber, Long atmId, Date timeStamp, int amount, String type) {
		this.bankCardNumber = bankCardNumber;
		this.atmId = atmId;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.type = type;
	}
}