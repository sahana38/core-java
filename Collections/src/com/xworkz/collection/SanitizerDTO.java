package com.xworkz.collection;

import java.io.Serializable;
import java.util.Iterator;

public class SanitizerDTO implements Serializable {
	
	private int id;
	private String brand;
	private double price;
	private String color;
	
	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public SanitizerDTO(int id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	
	
		public SanitizerDTO() {
			
	}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public static Iterator<String> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
}






