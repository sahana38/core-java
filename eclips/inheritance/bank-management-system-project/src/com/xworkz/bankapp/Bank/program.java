package com.xworkz.bankapp.Bank;

public class program {
	 static int sum(String a,String b){
	    int i=Integer.parseInt(a);
	    int j=Integer.parseInt(b);
	    int k=0;
	    if(isNaN(i) && isNaN(j)){
	     k=i+j;
	    return k;
	    }
	    else 
	    return 0;
	}


	private static boolean isNaN(int i) {
		return false;
	}


	public static class Main {
	  public static void main(String[] args) {
	    System.out.println("Sum is:"+sum("1","2"));
	  }
	}
}
