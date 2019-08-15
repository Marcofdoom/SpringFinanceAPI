package com.bae.financeapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class PeopleBankAccount {

	@Id
	private Long bankAccountId;

	private Long accountNumber;

	private String bank;

	private String fornames;

	private String surnames;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String homeAddress;

	public PeopleBankAccount() {

	}

	public PeopleBankAccount(Long bankAccountId, Long accountNumber, String bank, String fornames, String surnames,
			Date dateOfBirth, String homeAddress) {
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.fornames = fornames;
		this.surnames = surnames;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
	}
}