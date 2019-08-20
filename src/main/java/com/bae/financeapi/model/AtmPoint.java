package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AtmPoint {

	@Id
	private Long atmId;

	private String operator;

	private String streetName;

	private String postCode;

	private Float latitude;

	private Float longitude;

	public AtmPoint() {

	}

	public AtmPoint(Long atmId, String operator, String streetName, String postCode, Float latitude, Float longitude) {
		this.atmId = atmId;
		this.operator = operator;
		this.streetName = streetName;
		this.postCode = postCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getAtmId() {
		return atmId;
	}

	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
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