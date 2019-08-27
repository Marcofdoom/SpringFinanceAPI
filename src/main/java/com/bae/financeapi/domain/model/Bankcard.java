package com.bae.financeapi.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bankcard {

	@Id
	private String cardNumber;

	@ManyToOne
	@JoinColumn(name = "account_number")
	private PeopleBankAccount accountNumber;

	private Long bankAccountId;

	private Long bankcardId;

	private String sortCode;

	private String bank;

	@OneToMany(mappedBy = "bankcardNumber")
	private List<EposTransactions> eposTransactions;

	@OneToMany(mappedBy = "bankcardNumber")
	private List<AtmTransactions> atmTransactions;

	public Bankcard() {

	}

	public Bankcard(String cardNumber, PeopleBankAccount accountNumber, Long bankAccountId, Long bankcardId,
			String sortCode, String bank) {
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.bankAccountId = bankAccountId;
		this.bankcardId = bankcardId;
		this.sortCode = sortCode;
		this.bank = bank;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public PeopleBankAccount getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(PeopleBankAccount accountNumber) {
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