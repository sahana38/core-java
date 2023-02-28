package com.xworkz.sahanaXworkz.dto;

import javax.validation.constraints.Min;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class GroceryDTO {
	
	private int id;
	@NotBlank(message="Name cannot be null")
	@Size(min=5, max=20, message="grocery name should be more than 5 and less than 20 chars")
	private String name;
	@NotBlank(message="shopName cannot be null")
	@Size(min=3, max=15, message="shopName should be more than 3 and less than 15 chars" )
	private String shopName;
	@NotBlank(message="units connot be null")
	@Size(min=3, max=20, message="units should  be greter than 3 and less than 20 chars")
	private String units;
	@NotBlank(message="type should not be null")
	@Size(min=3, max=20, message="type should be greater than 3 and less than 20 chars")
	private String type;
	@NotNull(message="price should not be null")
	@Min(value=1, message="price should be greater than 1rs")
	private Integer price;
	@NotBlank(message="type should not be null")
	@Size(min=3, max=20, message="type should be greater than 3 and less than 20 chars")
	private String area;
	}
