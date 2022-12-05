package com.xworkz.interview;

public class InterviewTester {

	public static void reverse(String data) {
		
		char newData[] = data.toCharArray();
		
	//	char newData[] = {'s','a','h','a','n','a'};
		
		for(int index = 0 ; index < newData.length ; index++) {
			System.out.print(newData[index] + " ");
		}
		
		//index = length -1;
		for(int index =  newData.length - 1 ; index >= 0 ; index--) {  /*logic to reverse the string value*/
			System.out.print(newData[index] + " ");
		}
		
	}

public static void main(String[] args)	{
	reverse("sahana");
	
	reverseMiddleWords("My name is sahana");
	
	convertFirstCharacterToUppercase("my name is sahana");
}
	
}
