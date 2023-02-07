package com.xworkz.sahana;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.sahana.DTO.BeverageDTO;
import com.xworkz.sahana.DTO.ChatDTO;
import com.xworkz.sahana.DTO.EducationDTO;
import com.xworkz.sahana.DTO.FamilyDTO;
import com.xworkz.sahana.DTO.MobileDTO;

@Component
@RequestMapping("/")
public class SahanaController {
	
	public SahanaController() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@GetMapping("/Email")
	public String onEmail(Model model) {
		System.out.println("running onEmail");
		model.addAttribute("Email","sahana@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String OnMobile(Model model) {
		System.out.println("running OnMobile");
		long Mno=9606368938L;
		model.addAttribute("mobiles" , Mno);
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
		public String OnAdhar(Model model) {
			System.out.println("running OnAdhar");
			model.addAttribute("adhar", "5678 7976 2352" );
			return "index.jsp";
		}
	
	@GetMapping("/age")
	public String OnAge(Model model) {
		System.out.println("running OnAge");
		int age = 23;
		model.addAttribute("age", age);
		return "index.jsp";	
	}
	

	@GetMapping("/DOB")
	public String OnDob(Model model) {
		System.out.println("running OnDob");
		model.addAttribute("dateOfBirth", 26-10-1999);
		model.addAttribute("Time", "5.00 AM");
		return "index.jsp";
	}
	
	@GetMapping("/salary")
	public String OnSalary(Model model) {
		System.out.println("running salary");
		model.addAttribute("salary", "4LPA");
		return "index.jsp";
	}
	
	@GetMapping("/bestFriends")
	public String OnFriends(Model model) {
		System.out.println("running OnFriends");
		model.addAttribute("frnd", "john");
		model.addAttribute("frnds", "mery");
		return "index.jsp";

}
	@GetMapping("/VisitedPlaces")
	public String OnPalces(Model model) {
		System.out.println("running OnPalces");
		model.addAttribute("city", "Mudhol");
		return "index.jsp";
	}
	
	@GetMapping("/skill")
	public String OnSkill(Model model) {
		System.out.println("running OnSkill");
		model.addAttribute("skill","       ●    Basics of java: Methods, Method Overloading, Constructor,  Object, Collection, Map.\r\n"
				+"●	Basics of Web technology: html, CSS.\r\n"
				+ "●	Basics of Sql: DDL , DML.");
				return "index.jsp";
	}
	
	@GetMapping("/dto")
    public String OnDto(Model model) {
    	System.out.println("running OnDto");
    	
    	EducationDTO dto = new EducationDTO();
    	dto.setName("sahana");
    	dto.setLocation("Mudhol");
    	dto.setDist("Bagalkot");
    	dto.setTq("Mudhol");
    	dto.setSchool("Bill Memory School");
    	dto.setPassingYear("2015");
    	dto.setPu("Vagdevi Vikas");
    	dto.setPuPassingYear("2017");
    	dto.setGraduation("BGMIT Mudhol ");
    	dto.setGPassingYear("2022");
    	dto.setCgpa("7.3cgpa");
    	model.addAttribute("data", dto);
    return "index.jsp";	
    }
	
	@GetMapping("/family")
    public String OnFamily(Model model) {
    	System.out.println("running OnFamily");
    	
    	FamilyDTO fam = new FamilyDTO();
    	fam.setFamilyName("Chittargi");
    	fam.setNativePlace("katageri");
    	fam.setNativePlaceDist("Bagalkot");
    	fam.setNativePlaceTq("Badami");
    	fam.setGrandFather("Shankargouda");
    	fam.setGrandMother("suvarna");
    	fam.setMotherName("Mala");
    	fam.setFatherName("Mahantesh");
        fam.setBrotherName("Supreet");
    	fam.setArea("Bakshi plot");
    	model.addAttribute("fdata", fam);
    	return "index.jsp";	
    }
	
	@GetMapping("/mobilePhone")
    public String OnPhone(Model model) {
    	System.out.println("running OnPhone");
    	
    	MobileDTO mob = new MobileDTO();
    	mob.setMobileName("Vivo Y73");
    	mob.setColor("Black");
    	mob.setType("SmartPhone");
    	mob.setPrice(21000);
    	mob.setStorage("128GB");
    	model.addAttribute("cell", mob);
    	return "index.jsp";	
    }
	
	 @GetMapping("/beverage")
	    public String OnBeverage(Model model) {
	    	System.out.println("running OnBeverage");
	    	
	    	BeverageDTO bev = new BeverageDTO();
	    	bev.setName("Coffee");
	    	bev.setFlavour("Chocolate");
	    	bev.setColor("creamy");
	    	bev.setCold(true);
	    	bev.setBuyer("anni");
	    	bev.setPrice(80);
	    	bev.setMadeBy("chef");
	    	bev.setTaste(true);
	    	model.addAttribute("Stall", bev);
	    	return "index.jsp";	
	    	}
	 
	 @GetMapping("/chats")
	    public String OnChats(Model model) {
	    	System.out.println("running OnChats");
	    	
	    	ChatDTO chat = new ChatDTO();
	    	chat.setName("PaniPuri");
	    	chat.setType("Spicy");
	    	chat.setCentreName("gubbi");
	    	chat.setNoOfChats(40);
	        chat.setOwner("shubhangi");
	        chat.setOwnerPhoneNum(4536782332L);
	        chat.setPlace("Mudhol");
	        chat.setPrice(100);
	        chat.setQuantity("Medium");
	        chat.setRatings(4);
	        chat.setTasty("yes");
	        chat.setId(26);
	        model.addAttribute("snacks", chat);
	        return "index.jsp";

}
}

	
   
    
    
        
	
	


