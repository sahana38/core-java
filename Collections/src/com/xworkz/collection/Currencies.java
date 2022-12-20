package com.xworkz.collection;

import java.util.TreeSet;

public class Currencies {
	
	public static void main(String[] args) {
	
	String currency1 =("US dollar");
	String currency2 = ("Euro");
	String currency3 = ("Japanese yen");
	String currency4 = ("AUD");
	String currency5 = ("CAD");
	String currency6 =("Canada dollar");
	String currency7 = ("Australian dollar");
	String currency8 = ("JPY");
	String currency9 = ("EUR");
	String currency10 = ("USD");
	String currency11 = ("Swiss franc");
	String currency12 = ("CHF");
	String currency13 = ("Canadian dollar");
	String currency14 = ("Chinese renminbi");
	String currency15 = ("CNH");
	String currency16 = ("Thai Baht");
	String currency17 = ("SGD");
	String currency18 = ("THB");
	String currency19 = ("Singabore Dollars");
	String currency20 = ("SGD");
	String currency21 = ("British pound sterling");
	String currency22 = ("CHF");
	String currency23 = ("Swiss F");
	String currency24 = ("AED");
	String currency25 = ("Afghani");
	String currency26 = ("AFN");
	
	 TreeSet<String> crny = new TreeSet<String>();	
	 
	 crny.add(currency1);
	 crny.add(currency2);
	 crny.add(currency3);
	 crny.add(currency4);
	 crny.add(currency5);
	 crny.add(currency6);
	 crny.add(currency7);
	 crny.add(currency8);
	 crny.add(currency9);
	 crny.add(currency10);
	 crny.add(currency11);
	 crny.add(currency12);
	 crny.add(currency13);
	 crny.add(currency14);
	 crny.add(currency15);
	 crny.add(currency16);
	 crny.add(currency17);
	 crny.add(currency18);
	 crny.add(currency19);
	 crny.add(currency20);
	 crny.add(currency21);
	 crny.add(currency22);
	 crny.add(currency23);
	 crny.add(currency24);
	 crny.add(currency25);

	 
	 System.out.println(crny.size());
		
	 crny.clear();
	 System.out.println("After clear..");
		
	System.out.println(crny.size());
 }

}
