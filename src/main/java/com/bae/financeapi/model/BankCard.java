package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankCard {

	@Id
	private Long bankCardId;

	private Long bankAccountId;

	private Long cardNumber;

	private String sortCode;

	private Long accountNumber;

	private String bank;

	public BankCard() {

	}

	public BankCard(Long bankCardId, Long bankAccountId, Long cardNumber, String sortCode, Long accountNumber,
			String bank) {
		this.bankCardId = bankCardId;
		this.bankAccountId = bankAccountId;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
		this.bank = bank;
	}
}