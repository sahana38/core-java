class Zomato{

  //Pizza, Burger, Sandwitch, mosaranna, frenchfries, SouthIndian, Pastries.

   public static String takeOrder(){
     String item[] = {"Pizza", "Burger", "Sandwitch", "mosaranna", "frenchfries", "SouthIndian", "Pastries" };


      for(int a=0; a < item.length ; a++)
        {
         System.out.println(item[a] + " " );
        }


      if(item =="Pizza")
        {
         System.out.println("thank you for Ordering" +item);
        }

   return item;
  }
}
