package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankCard {

	@Id
	private Long cardNumber;

	private Long accountNumber;

	private Long bankAccountId;

	private Long bankCardId;

	private String sortCode;

	private String bank;

	public BankCard() {

	}

	public BankCard(Long cardNumber, Long accountNumber, Long bankAccountId, Long bankCardId, String sortCode,
			String bank) {
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.bankAccountId = bankAccountId;
		this.bankCardId = bankCardId;
		this.sortCode = sortCode;
		this.bank = bank;
	}
}