package com.xworkz.sahanaXworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.sahanaXworkz.dto.GroceryDTO;
import com.xworkz.sahanaXworkz.entity.GroceryEntity;
import com.xworkz.sahanaXworkz.repository.GroceryRepository;

@Service
public class GroceryServiceImpl implements GroceryService {

	@Autowired
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<GroceryDTO>> validateAndSave(GroceryDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<GroceryDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;

		} else {
			System.out.println("Violations is not there in dto,you can save");
			GroceryEntity entity = new GroceryEntity();
			entity.setName(dto.getName());
			entity.setShopName(dto.getShopName());
			entity.setUnits(dto.getUnits());
			entity.setType(dto.getType());
			entity.setPrice(dto.getPrice());
			entity.setArea(dto.getArea());
			entity.setId(dto.getId());
			boolean saved = this.groceryRepository.save(entity);
			System.out.println("Entity data saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public GroceryDTO findById(int id) {
		if (id > 0) {
			GroceryEntity entity = this.groceryRepository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				GroceryDTO dto = new GroceryDTO();
				dto.setName(entity.getName());
				dto.setShopName(entity.getShopName());
				dto.setUnits(entity.getUnits());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				dto.setArea(entity.getArea());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return GroceryService.super.findById(id);
	}
	
	public List<GroceryDTO> findByShopName(String shopName){
		System.out.println("running findByShopName in service" +shopName);
		
		if(shopName != null && !shopName.isEmpty()) {
			System.out.println("shopName is valid....calling repo..");
			List<GroceryEntity> entities = this.groceryRepository.findByShopName(shopName);
			
			//list<Entity>---->list<Dto>
			List<GroceryDTO> listOfDto = new ArrayList<GroceryDTO>();
			for(GroceryEntity entity : entities) {
				GroceryDTO dto = new GroceryDTO();dto.setName(entity.getName());
				dto.setShopName(entity.getShopName());
				dto.setUnits(entity.getUnits());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				dto.setArea(entity.getArea());
				dto.setId(entity.getId());
				listOfDto.add(dto); //adding to list
			}
			
			System.out.println("size of dtos" +listOfDto.size());
			System.out.println("size of entities" +entities.size());
			return listOfDto;
		}else {
			System.err.println("ShopName is invalid");
			
		}
		
		return GroceryService.super.findByShopName(shopName);
	}

}
