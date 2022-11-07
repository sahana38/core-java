class ToyTester{
public static void main(String d[]){
  
  Toys.setBrand("NK STAR");
  Toys.setToyVehicle("car");
  Toys.setMaterial("Plastic");
  Toys.setColor("Multicolor");

 System.out.println(Toys.getBrand() + " \n  " +
                    Toys.getToyVehicle() + " \n " +
                    Toys.getMaterial() + " \n " +
                    Toys.getColor() );
 }
}