package com.xworkz.collection;
import java.util.ArrayList;
import java.util.List;


public class IndexMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(150);
		list.add(233);
		list.add(389);
		list.add(9884);
		list.add(3443);
		list.add(682);
		
		list.add(5,854);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println(System.lineSeparator());
		
		list.set(0, 567);
		list.remove(1);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println(System.lineSeparator());
				
		Integer ref=list.get(3);
		System.out.println("index value of 2:"+ref);
		
		/* list<String> list1 = new ArrayList<String>();
		 * list.add("A");
		 * list.add("B");
		 * list.add("C");
		 * 
		 * list.add(1,"E");    ------>[A, B, C]
		 * 
		 * 
		 */
		
	}

}
