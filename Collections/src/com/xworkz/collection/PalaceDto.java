package com.xworkz.collection;


import java.io.Serializable;

public class PalaceDto implements Serializable {

	private String name;
	private String location;
	private String buildBy;
	private Boolean destroyed;
	private Double fee;

	public PalaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDto(String name, String location, String buildBy, Boolean destroyed, Double fee) {
		super();
		this.name = name;
		this.location = location;
		this.buildBy = buildBy;
		this.destroyed = destroyed;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "PalaceDto [name=" + name + ", location=" + location + ", buildBy=" + buildBy + ", destroyed="
				+ destroyed + ", fee=" + fee + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildBy() {
		return buildBy;
	}

	public void setBuildBy(String buildBy) {
		this.buildBy = buildBy;
	}

	public Boolean getDestroyed() {
		return destroyed;
	}

	public void setDestroyed(Boolean destroyed) {
		this.destroyed = destroyed;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
}

