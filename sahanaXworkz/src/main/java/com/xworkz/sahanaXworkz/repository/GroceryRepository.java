package com.xworkz.sahanaXworkz.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.sahanaXworkz.entity.GroceryEntity;

public interface GroceryRepository {

	boolean save(GroceryEntity entity);

	default GroceryEntity findById(int id) {
		return null;

	}
	
	default List<GroceryEntity>findByShopName(String shopName){
		return Collections.emptyList();
		
		
	}

}
