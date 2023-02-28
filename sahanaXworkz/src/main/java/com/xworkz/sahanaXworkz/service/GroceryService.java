package com.xworkz.sahanaXworkz.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.sahanaXworkz.dto.GroceryDTO;

public interface GroceryService {

	Set<ConstraintViolation<GroceryDTO>> validateAndSave(GroceryDTO dto);

	default GroceryDTO findById(int id) {
		return null;
	}
	
	default List<GroceryDTO> findByShopName(String shopName) {
		return null;
	}

}
