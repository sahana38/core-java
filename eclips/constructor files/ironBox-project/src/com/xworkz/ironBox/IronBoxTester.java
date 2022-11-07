package com.xworkz.ironBox;

public class IronBoxTester {
	public static void main(String[] i) {
		
		IronBox ironbx = new IronBox("DX-7", "1000 watts", "Philips", 529);
		System.out.println(ironbx.id +" "+ ironbx.wattage +" "+ ironbx.name +" "+ ironbx.price);
		
		
		IronBox ironbx1 = new IronBox("DX-7", "1200 watts", "Bajaj", 549);
		System.out.println(ironbx1.id +" "+ ironbx1.wattage +" "+ ironbx1.name +" "+ ironbx1.price);
			
		
		IronBox ironbx2 = new IronBox("DX-7", "800 watts", "Slimo", 519);
		System.out.println(ironbx2.id +" "+ ironbx2.wattage +" "+ ironbx2.name +" "+ ironbx2.price);
			
			
			
	}

}
