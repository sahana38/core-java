class FurnitureTester{

 public static void main(String h[]){

    Furniture.setName("Wardrobe");
    Furniture.setPrice(15599.00);
    Furniture.setColor("brown");

    System.out.println(Furniture.getName() + " " +
                       Furniture.getPrice() + " " +
                       Furniture.getColor());
  }
}