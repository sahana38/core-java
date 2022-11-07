class Bag {
   
     static String Brand;
     static String Quality;

     public static void main(String a[]){

      System.out.println("Before initialization");

     System.out.println("Bag Brand is " + Brand);
     System.out.println("Bag Quality is " + Quality);
     System.out.println("Bag Cost is " + Cost);

     Brand = "safari";
     Quality = "1";
     double Cost = 400.0;

     System.out.println("Bag Brand is " + Brand);
     System.out.println("Bag Quality is " + Quality);
     System.out.println("Bag Cost is " + Cost);
  
  }
}