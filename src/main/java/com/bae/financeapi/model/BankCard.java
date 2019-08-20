package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public Long getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Long bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
}