class Speaker{

   static String brand;
   static String color;
   static double price;
   static boolean isConnected ;

  public static boolean onOrOff(){

   System.out.println("inside onOrOff() ");

      if(isConnected == false){
         isConnected = true;
          System.out.println("speaker is turned onn.."); 
        }



      else if(isConnected == true){
         isConnected = false; 
          System.out.println("speaker is turned off.."); 
       }

   System.out.println("end of onOrOff()" ); 
   return isConnected;

   }
}