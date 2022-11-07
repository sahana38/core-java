class DMart{
     static String superMarketName = "Reliance Mart";  
     
     static String perfumes[]= {"1.Azzaro","2.versace","3.Hugo Boss","4.Fog", "5.Yardley", "6.Sping", "7.Engauge", "8.Dove", "9.What a Girl","10.Diamond"};
   public static void main(String h[]){
    
     String fruits[]={"1.Apple", "2.Butter Fruit","3.Banana","4.Cape","5.Jackfruit","6.Black Plum","7.Grapes","8.Kiwi Fruit","9.Lemon","10.Mango"};

    System.out.println("Welcome to " +superMarketName);


         
     /*System.out.println("***************************");
      System.out.println("list of Perfumes");
        System.out.println("**************************");
         System.out.println(perfumes[0] + " \n" +
                            perfumes[1] + " \n" +
                            perfumes[2] + " \n" +
                            perfumes[3] + " \n" +
                            perfumes[4] + " \n" +
                            perfumes[5] + " \n" +
                            perfumes[6] + " \n" +
                            perfumes[7] + " \n" +
                            perfumes[8] + " \n" +
                            perfumes[9]);*/

 System.out.println("***************************");
       for(int z=0; z< perfumes.length ; z++){
           System.out.println(perfumes[z] + " ");
           }


System.out.println("***************************");

       for(int s=0; s<fruits.length ; s++){
           System.out.println(fruits[s] + " ");
           }

     }

}