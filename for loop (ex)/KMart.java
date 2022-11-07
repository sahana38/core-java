class KMart{
     static String superMarketName = "K Mart";  
     
     static String perfumes[]= {"1.Azzaro","2.versace","3.Hugo Boss","4.Fog", "5.Yardley", "6.Sping", "7.Engauge", "8.Dove", "9.What a Girl","10.Diamond"};


 public static void main(String h[]){


   System.out.println("Welcome to " +superMarketName);

     String vegetables[]={"1.Onion", "2.carrot", "3.tomato", "4.drum stick","5.potato","6.Lady's Finger","7.Cauliflower","8.Spinach","9.Radish","10.Brinjal"};
  
     String fruits[]={"1.Apple", "2.Butter Fruit","3.Banana","4.Cape","5.Jackfruit","6.Black Plum","7.Grapes","8.Kiwi Fruit","9.Lemon","10.Mango"};
          
     String biscuits[]={"1.Good Day", "2.50-50","3.Unibic","4.Marie","5.Bour Bon","6.Parle-G","7.20-20","8.Monako","9.Fab","10.Hide & seek"};

     String chocolates[]={"1.Dairy Milk","2.Fuse","3.5-star","4.Mars","5.Ferrero Rocher","6.campco","7.Hershey","8.Choco Pie","9.Pacari","10.Lotus"};

     String meat[]={"1.Chicken","2.Mutton","3.Fish","4.Prawn","5.Pork","6.Beef"};
  
     String grocery[]={"1.Ajwain","2.Almonds","3.Anise","4.Barley","5.Beans","6.Black-gram","7.Calamus","8.Camphor","9.Cardamo", "10.Cashew"};	

     String shoes[]={"Nike","Adidas","Reebok","Puma","Skechers","New Balance","Under Armour","Xtep","Bata","Red Tape"};
    
     String cosmetics[]={"1.Moisturizer","2.Primer", "3.Foundation", "4.Concealer", "5.Face powder", "6.Blush", "7.Lipstick","8.Lip balm","9.Skin Serum","10.Sunscreen"};

     String electronicDevices[]={"1.Fan","2.AC","3.Oven","4.refrigerator","5.Washing Machine","6.computer","7.iron box","8.Mouse","9.Blender","10.Bulb"};
 
     String clothes[]={"1.kurta","2.T-shirt","3.Sweater","4.Jacket","5.Coat","6.Jeans","7.Socks","8.Tracksuits","9.Suit","10.Blazer"};




       System.out.println("***************************");
       System.out.println("list of vegetables");
       System.out.println("***************************");


       for(int z=0; z< vegetables.length ; z++){
           System.out.println(vegetables[z] + " ");
           }


      System.out.println("***************************");
      System.out.println("list of Perfumes");
      System.out.println("**************************");


       for(int z=0; z< perfumes.length ; z++){
           System.out.println(perfumes[z] + " ");
           }
         

      System.out.println("***************************");
      System.out.println("list of fruits");
      System.out.println("***************************");


       for(int z=0; z< fruits.length ; z++){
           System.out.println(fruits[z] + " ");
           }


      
      System.out.println("***************************");
      System.out.println("list of biscuits ");
      System.out.println("**************************");
       

       for(int z=0; z< biscuits.length ; z++){
           System.out.println(biscuits[z] + " ");
           }


      
      System.out.println("***************************");
      System.out.println("list of chocolates ");
      System.out.println("***************************");

       for(int z=0; z< chocolates.length ; z++){
           System.out.println(chocolates[z] + " ");
           }
         
       
      System.out.println("***************************");
      System.out.println("list of meat ");
      System.out.println("***************************");


       for(int z=0; z< meat.length ; z++){
           System.out.println(meat[z] + " ");
           }
        


     
      System.out.println("***************************");
      System.out.println("list of grocery ");
      System.out.println("***************************");


       for(int z=0; z< grocery.length ; z++){
           System.out.println(grocery[z] + " ");
           }
        
      
      System.out.println("***************************");
      System.out.println("list of  shoes");
      System.out.println("***************************");


       for(int z=0; z< shoes.length ; z++){
           System.out.println(shoes[z] + " ");
           }
        




      System.out.println("***************************");
      System.out.println("list of cosmetics");
      System.out.println("***************************");

       for(int z=0; z< cosmetics.length ; z++){
           System.out.println(cosmetics[z] + " ");
           }
        





      System.out.println("***************************");
      System.out.println("list of electronicDevices ");
      System.out.println("***************************");

      for(int z=0; z< electronicDevices.length ; z++){
           System.out.println(electronicDevices[z] + " ");
           }
         





      System.out.println("***************************");
      System.out.println("list of clothes");
        System.out.println("**************************");

         for(int z=0; z< clothes.length ; z++){
           System.out.println(clothes[z] + " ");
           }
      }
}