package com.xworkz.sahana.DTO;

import lombok.Data;

@Data
	
	public class ChatDTO {

		public String name;
		public String type;
		public int price;
		public String quantity;
		public String tasty;
		public int ratings;
		public String centreName;
		public String owner;
		public long ownerPhoneNum;
		public int noOfChats;
		public String place;
		public int id;
		
		public ChatDTO() {
			System.out.println("Created "+this.getClass().getSimpleName());

		}

}
