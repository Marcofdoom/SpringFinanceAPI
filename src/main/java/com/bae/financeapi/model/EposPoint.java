package com.bae.financeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EposPoint {

	@Id
	private Long eposId;

	private String vendor;

	private String streetName;

	private String postcode;

	private Float latitude;

	private Float longitude;

	public EposPoint() {

	}

	public EposPoint(Long eposId, String vendor, String streetName, String postcode, Float latitude, Float longitude) {
		this.eposId = eposId;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getEposId() {
		return eposId;
	}

	public void setEposId(Long eposId) {
		this.eposId = eposId;
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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
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