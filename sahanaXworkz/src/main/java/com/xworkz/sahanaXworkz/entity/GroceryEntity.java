package com.xworkz.sahanaXworkz.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="grocery_table")
@NamedQuery(name = "findByShopName", query= "select ent from GroceryEntity ent where ent.shopName=:shopName")
public class GroceryEntity {
	
	
	@Id
	@Column(name="g_id")
	private int id;
	@Column(name="g_name")
	private String name;
	@Column(name="g_shopName")
	private String shopName;
	@Column(name="g_units")
	private String units;
	@Column(name="g_type")
	private String type;
	@Column(name="g_price")
	private Integer price;
	@Column(name="g_area")
	private String area;

}
