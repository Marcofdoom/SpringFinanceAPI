package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bankcard {

	@Id
	private Long cardNumber;

	private Long accountNumber;

	private Long bankAccountId;

	private Long bankcardId;

	private String sortCode;

	private String bank;

	public Bankcard() {

	}

	public Bankcard(Long cardNumber, Long accountNumber, Long bankAccountId, Long bankcardId, String sortCode,
			String bank) {
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.bankAccountId = bankAccountId;
		this.bankcardId = bankcardId;
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

	public Long getBankcardId() {
		return bankcardId;
	}

	public void setBankcardId(Long bankcardId) {
		this.bankcardId = bankcardId;
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