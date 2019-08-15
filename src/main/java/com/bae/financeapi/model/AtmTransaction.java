package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AtmTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private Long bankCardNumber;

	private Long atmId;

	private String timeStamp;

	private int amount;

	private String type;

	public AtmTransaction() {

	}

	public AtmTransaction(Long bankCardNumber, Long atmId, String timeStamp, int amount, String type) {
		this.bankCardNumber = bankCardNumber;
		this.atmId = atmId;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.type = type;
	}
}