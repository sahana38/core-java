package com.xworkz.collection;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDto> palace = new LinkedList<PalaceDto>();

		palace.add(new PalaceDto("Banglore palace", "Mysore", "Pondi", false, 50.0));
		palace.add(new PalaceDto("Mysore Palace", "BTM", "sneha", true, 500.0));
		palace.add(new PalaceDto("fantasy Palace", "Hassan", "Anu", false, 50000.0));
		palace.add(new PalaceDto("versailles", "Banglore", "Muskhan", true, 100.0));

		palace.stream().forEach(dto -> System.out.println(dto));
		System.out.println("after destroying the palace");
		palace
		.stream()
		.filter(e -> e.getDestroyed())
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));

	}

}
