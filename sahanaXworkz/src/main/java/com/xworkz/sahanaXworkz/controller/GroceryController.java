package com.xworkz.sahanaXworkz.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.sahanaXworkz.dto.GroceryDTO;
import com.xworkz.sahanaXworkz.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryController {

	@Autowired
	private GroceryService groceryService;

	private List<String> grocery = Arrays.asList("fruits", "Dairy", "spices", "vegetables", "frozenFoods");

	public GroceryController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("grocery")
	public String onGrocery(Model model) {
		System.out.println("Running onGrocery in get");
		List<String> grocery = Arrays.asList("fruits", "Dairy", "spices", "vegetables", "frozenFoods");
		model.addAttribute("grocery", grocery);
		return "Grocery";
	}
	
	

	@GetMapping("search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch " + id);
		GroceryDTO dto = this.groceryService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "GrocerySearch";
	}
	

	@PostMapping("grocery")
	public String onGrocery(Model model, GroceryDTO dto) {
		System.out.println("Running onGrocery on post " + dto);
		Set<ConstraintViolation<GroceryDTO>> violations = this.groceryService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go for a success page");
			return "Grocery";

		}

		model.addAttribute("grocery", grocery);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("violations in controller");
		return "Grocery";
	}
	
	@GetMapping("/searcbyshopname")
	public String onSearchByShopName(@RequestParam String shopName, Model model) {
		System.out.println("running onSearchByShopName controller" +shopName);
		List<GroceryDTO> list = this.groceryService.findByShopName(shopName);
		model.addAttribute("list", list);
		return "ShopNameSearch";
	}
}
