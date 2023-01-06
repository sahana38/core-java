package com.xworkz.collection;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Comparator;
	import java.util.stream.Collectors;
	
	public class WeaponTester {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Collection<WeaponDTO> collection = new ArrayList<WeaponDTO>();
			collection.add(new WeaponDTO("cannon", "Avinash", "Jan" , 9999.00, Type.French75));
			collection.add(new WeaponDTO("catapult", "Akash", "Feb" , 129999.00, Type.onager));
			collection.add(new WeaponDTO("bomb", "Sagar", "March" , 135678.00, Type.atomicbomb));
			collection.add(new WeaponDTO("thermonuclear bomb", "Supreet", "April" , 799999.00, Type.neutronbomb));
			collection.add(new WeaponDTO("arrow", "Sachin", "May" , 9876639.00, Type.crossbow));
			collection.add(new WeaponDTO("carbine", "Arun", "June" , 97639.00, Type.SpencerCarbine));
			collection.add(new WeaponDTO("handgun", "Varun", "July" , 12467.00, Type.derringer));
			collection.add(new WeaponDTO("rifle", "Ajay", "Aug" , 967543.00, Type.DreyseRifle));
			collection.add(new WeaponDTO("pistol", "Vijay", "Sep" , 999999.00, Type.LugerPistol));
			collection.add(new WeaponDTO("assault rifle", "Kiran", "Oct" ,12399.00, Type.AK47));
			collection.add(new WeaponDTO("gun", "Shivu", "Nov" , 6555499.00, Type.MG42));
			collection.add(new WeaponDTO("submachine gun", "Aravind", "Dec" , 432399.00, Type.SteGun));
			collection.add(new WeaponDTO("cannon", "Avinash", "Jan" , 9999.00, Type.French75));
			collection.add(new WeaponDTO("catapult", "Akash", "Feb" , 129999.00, Type.onager));
			collection.add(new WeaponDTO("bomb", "Sagar", "March" , 135678.00, Type.atomicbomb));
			collection.add(new WeaponDTO("thermonuclear bomb", "Supreet", "April" , 799999.00, Type.neutronbomb));
			collection.add(new WeaponDTO("arrow", "Sachin", "May" , 9876639.00, Type.crossbow));
			collection.add(new WeaponDTO("carbine", "Arun", "June" , 97639.00, Type.SpencerCarbine));
			collection.add(new WeaponDTO("handgun", "Varun", "July" , 12467.00, Type.derringer));
			collection.add(new WeaponDTO("rifle", "Ajay", "Aug" , 967543.00, Type.DreyseRifle));
			collection.add(new WeaponDTO("pistol", "Vijay", "Sep" , 999999.00, Type.LugerPistol));
			collection.add(new WeaponDTO("assault rifle", "Kiran", "Oct" ,12399.00, Type.AK47));
			collection.add(new WeaponDTO("gun", "Shivu", "Nov" , 6555499.00, Type.MG42));
			collection.add(new WeaponDTO("submachine gun", "Aravind", "Dec" , 432399.00, Type.SteGun));
			
			collection.stream().filter(ele->ele.isFree()!=false || ele.getName()=="cannon" || ele.getPrice()>129999.00)
			.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
			
			collection.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e));
			 System.out.println(System.lineSeparator());
		    collection.stream().forEach(e->System.out.println(" Weapons Made By :"+e.getMadeBy()+" "+" Weapons Made on :"+e.getMadeOn()));
			
		    System.out.println("\n names Sorted in desc order....");
		    collection
		    .stream()
		    .sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		    .forEach(e->System.out.println(e.getName()));
			
			System.out.println("\n Sorted in desc order....");
			collection
			.stream()
			.sorted((a1, a2) -> a2.getMadeBy().compareTo(a1.getMadeBy()))
			.forEach(e -> System.out.println(e));
			
			System.out.println("\n Sorted in acs order.....");
			collection
			.stream()
			.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
			.forEach(e -> System.out.println(e));
			
			System.out.println(" \n Sorted budget in asc order.....");
			Comparator<WeaponDTO> comparator = (a1,a2) -> Double.compare(a1.getPrice(), a2.getPrice());
			collection
			.stream()
			.sorted(comparator)
			.forEach(e -> System.out.println(e));
					
			System.out.println(" \n Sorted budget in desc order.....");
			Comparator<WeaponDTO> comparator1 = (a1,a2) -> Double.compare(a2.getPrice(), a1.getPrice());
		    collection
			.stream()
			.sorted(comparator1)
			.forEach(e -> System.out.println(e));	
		    
		    System.out.println("\n.....Sorted name and madeOn in asc order.....");
		    collection
		    .stream()
		    .sorted((a1,a2)->(a1.getName()+a1.getMadeOn()).compareTo(a2.getName()+a2.getMadeOn()))
		    .forEach(e->System.out.println(e.getName() +"--"+e.getMadeOn()));
		    /*System.out.println("_____________");
			collection
			.stream()
			.sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn()))
			.forEach(e->System.out.println(e.getMadeOn()));*/
			
			System.out.println(" \n.....Sorted type , madeOn and name in asc order.....");
			collection
			.stream()
			.sorted((a1,a2)->(a2.getType()+a2.getMadeBy()+a2.getName()).compareTo(a1.getType()+a1.getMadeBy()+a1.getName()))
			.forEach(e->System.out.println(e.getType() + "--" +e.getMadeBy()+"--" +e.getName()));
			/*System.out.println("_____________");
			collection
			.stream()
			.sorted((a1,a2)->a2.getMadeBy().compareTo(a1.getMadeBy()))
			.forEach(e->System.out.println(e.getMadeBy()));
			System.out.println("_____________");
			collection
		    .stream()
		    .sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		    .forEach(e->System.out.println(e.getName()));*/
	}
	}





