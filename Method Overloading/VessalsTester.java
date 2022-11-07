class VessalsTester{

 public static void main(String h[]){
    
   Vessals.setMaterial("Plastic");
   Vessals.setType("Bowl");
   Vessals.setPrice(100.00);

System.out.println( Vessals.getMaterial() + " " +
   Vessals.getType() + " " +
   Vessals.getPrice());
  }

}