class VivantaTajHotel{
   
   public static void main(String d[]){

    String type = " 5 Star Hotel ";
    String address = "MG Road"; 
    String[] managerNames = {"Aksahata","Lakshmi","Sangeeta","Ganesh","Sumanth"};
    int noOfManagers = 5;
    String foodMenu[] = {"1.gobi startor","2.paneer masal","3.Veg Handi","4.Kaju Masala","5.veg Kadai","6.palak paneer","7.Roti", "8.kulcha", "9.Naan","10.jeera Rice","11.Veg fried rice","12.Veg Biriyani","13.Dal kichadi","14.Chiken biriyani","15.cold drinks"};

System.out.println("Welcome to  VivanataTajHotel");
System.out.println("Type of Hotel: " +type);


System.out.println("Number of Managers: " +noOfManagers);

System.out.println("________________________");
System.out.println("list of Managers: ");
System.out.println("________________________");
   for(int c = 0 ; c < managerNames.length ; c++){
     System.out.println(managerNames[c] + " ");
     }


System.out.println("***********************");
System.out.println("Menu");
System.out.println("*************************");
    for(int v = 0 ; v < foodMenu.length ; v++){
    System.out.println(foodMenu[v] + " ");
    }
  }
}