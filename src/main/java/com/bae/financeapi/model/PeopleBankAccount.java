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
	private Long accountNumber;

	private Long bankAccountId;

	private String bank;

	private String forenames;

	private String surname;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String homeAddress;

	public PeopleBankAccount() {

	}

	public PeopleBankAccount(Long bankAccountId, Long accountNumber, String bank, String forenames, String surname,
			Date dateOfBirth, String homeAddress) {
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
	}
}