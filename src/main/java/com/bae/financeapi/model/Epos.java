package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Epos {

	@Id
	private Long Id;

	private String vendor;

	private String streetName;

	private String postCode;

	private Double latitude;

	private Double longitude;

	public Epos() {

	}

	public Epos(Long id, String vendor, String streetName, String postCode, Double latitude, Double longitude) {
		Id = id;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postCode = postCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}