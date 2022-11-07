class Garage{

static void getVehicleNos(String[] vehicleNos){

     System.out.println("inside getVehicleNos()");

     System.out.println("Number of vehicles is" +vehicleNos.length);

     System.out.println("List of vehicleNos are");


for(int i=0; i < vehicleNos.length ; i++){
   System.out.println(vehicleNos[i]);
   }    
  
System.out.println("End of getVehicleNos()");
  }

}    