package com.xworkz.watch;

public class Watch {
	
	public String watchId;
	public String color;
	public String brandName;
	public String watchType;
	public int price;
	
	//use of construstor is to init the instance variable of a class
	//parameterized constructor
	public  Watch(String wId,String clr, String bName,String type,int prc  ) {
		System.out.println("\n object is created");
		watchId = wId;
		color = clr;
		brandName = bName;
		watchType=type;
		price=prc;
	}
	
	
	
	   public void toHelpOrgToGrow() {
		    System.out.println("nanu.. nane..");
	   }
	   

}
