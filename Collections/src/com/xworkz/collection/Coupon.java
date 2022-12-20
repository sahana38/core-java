package com.xworkz.collection;


import java.util.LinkedList;
public class Coupon {
	
	public static void main(String[] args) {
		
		String coupon1 =("FreeShop");
		String coupon2 =("Summer");
		String coupon3 =("Save10");
		String coupon4 =("Spring");
		String coupon5 =("Save20");
		String coupon6 =("blackFriDay");
		String coupon7 =("Holiday");
		String coupon8 =("Twitter");
		String coupon9 =("Laborday");
		String coupon10 =("Swagbucks");
		String coupon11 =("Groupon");
		String coupon12 =("Rakuten");
		
		
		LinkedList<String> coupon = new LinkedList();
		
		coupon.add(coupon1);
		coupon.add(coupon2);
		coupon.add(coupon3);
		coupon.add(coupon4);
		coupon.add(coupon5);
		coupon.add(coupon6);
		coupon.add(coupon7);
		coupon.add(coupon8);
		coupon.add(coupon9);
		coupon.add(coupon10);
		coupon.add(coupon11);
		coupon.add(coupon12);
		
        System.out.println(coupon.size());
		
        coupon.clear();
		System.out.println("After clear..");
		
		System.out.println(coupon.size());	
	}

}
