package com.xworkz.interview;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		String str="";
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String stringInput = sc.next();
		char[] resultarray = stringInput.toCharArray();
		
		for(int i=resultarray.length-1 ; i>=0 ; i--) {
			
			System.out.print(resultarray[i]);	
			str= str + resultarray[i];
			
		}
		if(stringInput.equals(str))
		{
			System.out.println(" it is palindrome");
	
			}
		else {
			System.out.println(" it is not palindrome");
		}
		
		
				
	}

}
