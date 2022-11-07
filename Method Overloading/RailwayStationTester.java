class RailwayStationTester{

 public static void main(String s[]){
 
   RailwayStation.setFromStation("Banglore mejestic");
   RailwayStation.setToStation("Bagalkot");
   RailwayStation.setDayAndDate(" Mon, 1/1/2022 ");
   RailwayStation.setRate(500.00);

System.out.println(RailwayStation.getFromStation() + " \n " +
                   RailwayStation.getToStation() + " \n " +
                   RailwayStation.getDayAndDate() + " \n " +
                   RailwayStation.getRate());
  }
}