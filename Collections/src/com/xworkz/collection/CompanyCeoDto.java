package com.xworkz.collection;

import java.io.Serializable;

public class CompanyCeoDto  implements Serializable {

	private String name;
	private String company;
	private Integer age;
	private String country;
	private Boolean married;
	private DaughterDTO dto;

	public CompanyCeoDto() {
		// TODO Auto-generated constructor stub
	}

	
	public CompanyCeoDto(String name, String company, Integer age, String country, Boolean married, DaughterDTO dto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.married = married;
		this.dto = dto;
	}


	@Override
	public String toString() {
		return "CompanyCeoDto [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", married=" + married + ", dto=" + dto + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public DaughterDTO getDto() {
		return dto;
	}

	public void setDto(DaughterDTO dto) {
		this.dto = dto;
	}
}


