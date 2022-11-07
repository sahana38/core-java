class GalaxyTester{


public static void main(String d[]){
  Galaxy.setType("Galaxy Z");
  Galaxy.setColor("Black");
  Galaxy.setPrice(60000.00);

System.out.println(Galaxy.getType() + " \n " +
                   Galaxy.getColor() + " \n " +
                   Galaxy.getPrice());
   }
}