package com.xworkz.interview;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] b) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		
		while(n > 0) {
			int rem = n% 10;
			rev = (rev*10)+rem;
			n = n/ 10;
		}
		
		if(temp== rev) {
			System.out.println("Is palindrome");
		}
		else {
				System.out.println("Not Palindrome");
		      }
		}
	}


