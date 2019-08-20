package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Epos {

	@Id
	private Long Id;

	private String vendor;

	private String streetName;

	private String postCode;

	private Float latitude;

	private Float longitude;

	public Epos() {

	}

	public Epos(Long id, String vendor, String streetName, String postCode, Float latitude, Float longitude) {
		this.Id = id;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postCode = postCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
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