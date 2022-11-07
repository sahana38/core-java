class Truffles{
   
   public static void main(String d[]){

    String type = "Fast food restaurant";
    String address = "Koramangala"; 
    String[] managerNames = {"Supreet","Mani","sachin","Akash","sagar"};
    int noOfManagers = 5;
    String foodMenu[] = {"1.Margarita","2.Cafe Mocha","3.thai Basil Mashroom","4.Paneer Tikka","5.Irish hot chocolate","6.Watermelon Mojitos","7.Pasta", "8.Sun Dried tomato", "9.Hot Potch","10.Choco mousse","11.Apple Pie","13.Lemon Tart","14.Red velvet","15.Marshmellows"};


System.out.println("***********************");
System.out.println("Welcome to Truffles");
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

