package com.bae.financeapi.model.DTO;

import java.util.Date;

import com.bae.financeapi.util.TransactionType;

public class TransactionsDTO {

	private Date timestamp;

	private Float amount;

	private String company;

	private String streetName;

	private Float latitude;

	private Float longitude;

	private String accountNumber;

	private TransactionType type;

	public TransactionsDTO(Date timestamp, Float amount, String company, String streetName, Float latitude,
			Float longitude, String accountNumber) {
		this.timestamp = timestamp;
		this.amount = amount;
		this.company = company;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

}
