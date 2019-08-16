package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AtmPoint {

	@Id
	private Long atmId;

	private String operator;

	private String streetName;

	private String postCode;

	private Double latitude;

	private Double longitude;

	public AtmPoint() {

	}

	public AtmPoint(Long atmId, String operator, String streetName, String postCode, Double latitude,
			Double longitude) {
		this.atmId = atmId;
		this.operator = operator;
		this.streetName = streetName;
		this.postCode = postCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}