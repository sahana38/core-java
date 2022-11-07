class SwiggyyTester{

   public static void main(String a[]){

   double itemPrice = Swiggyy.takeOrder("mosaranna",45);
   System.out.println("The item price is" +itemPrice);
    double itemPriceWithQuantity=Swiggyy.takeOrder("mosaranna",45);
    System.out.println("The item price is" +itemPrice);


     System.out.println("Your Final order is ready...Enjoy");
     
   }
}