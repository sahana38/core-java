package com.xworkz.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class CompanyCeoRunner {
	public static void main(String[] args) {

		Collection<CompanyCeoDto> companyCeo = new LinkedList<CompanyCeoDto>();

		DaughterDTO dto = new DaughterDTO("Roseee", 767668863L, 18, true);
		DaughterDTO dto1 = new DaughterDTO("Sofia", 869546732L, 23, true);
		DaughterDTO dto2 = new DaughterDto("Benki", 9995463452L, 20, true);
		DaughterDTO dto3 = new DaughterDto("lucinda", 8634256734L, 26, false);
		
		companyCeo.add(new CompanyCeoDto("Dharshan", "Terrorist", 39, "Pakistan", true, dto));
		companyCeo.add(new CompanyCeoDto("Manu", "Taliban", 45, "Afghaniatan", true, dto1));
		companyCeo.add(new CompanyCeoDto("Natraj", "Dating App", 43, "Huganda", true, dto2));
		companyCeo.add(new CompanyCeoDto("Akshay Joshi", "OMR", 49, "Londan", true, dto3));
		
		
		companyCeo.stream().filter(e->{return e.getDto()!=null;}).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("print all the daughter names in Company ceo dto");
		
		companyCeo.stream().map(e->e.getDto().getNameD()).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("CEO age greater than 30");
		
		companyCeo.stream().filter(e->e.getAge()>=30).collect(Collectors.toList()).forEach(e->System.out.println(e.getAge()));
		System.out.println("get the daughter age and company ceo age");
		
		companyCeo.stream().map((f)->f.getAge()).forEach((p)->{System.out.println("father age  "+p);});
		companyCeo.stream().map((m)->{return m.getDto().getAge();}).collect(Collectors.toList()).forEach((r)->System.out.println("daughter age  "+r));
		
		
		
	}

}