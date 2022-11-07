class EmpireHotel{
   
   public static void main(String d[]){


    String address = "Anand Rao Circle"; 
    String[] managerNames = {"Gidd Sneha","Mahananda","Muksana","Annakka","swati"};
    int noOfManagers = 5;
    String foodMenu[] = {"1.chilly chicken","2.Egg Masala","3.Pindi Chole","4.Babycorn Masala","5.Tomato Fry","6.Aloo jeera","7.Ghee rice", "8.Lemon rice", "9.Kerala parota","10.Coin parota","11.Dry parota","12.Tandoori Roti","13.Veg noodles","14.Prawn fried rice","15.Ice cream"};



System.out.println("Welcome to EmpireHotel");
System.out.println("***********************");


System.out.println("Number of Managers: " +noOfManagers);


System.out.println("  ");
System.out.println("________________________");
System.out.println("list of Managers: ");
System.out.println("________________________");


   for(int c = 0 ; c < managerNames.length ; c++){
     System.out.println(managerNames[c] + " ");
     }


System.out.println("  ");
System.out.println("_________________________");
System.out.println("*****Menu*****");
System.out.println("_________________________");


    for(int v = 0 ; v < foodMenu.length ; v++){
    System.out.println(foodMenu[v] + " ");
    }
  }
}