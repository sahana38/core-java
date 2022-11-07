class MannuTester{
  
   public static void main(String y[]){

      Mannu.setTypeOfMannu(" pit sand");
      Mannu.setPrice(20000.00);
      Mannu.setQuantity("1 Ton");

  System.out.println(Mannu.getTypeOfMannu() + " " +
                     Mannu.getPrice() + " " +
                      Mannu.getQuantity());
   }
}