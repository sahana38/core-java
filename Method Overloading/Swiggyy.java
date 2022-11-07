class Swiggyy{ 

	public static double takeOrder(String item, int quantity){
	

		if(item=="pizza")
                {
		System.out.println("thank for ordering"+item);
                return (99.00,quantity);
		}


		if(item=="burgar")
                {
		System.out.println("thank for ordering"+item);
                return (50.00,quantity);
		}


		if(item=="southindian")
                {
		System.out.println("thank for ordering"+item);
                return (100.00,quantity);
		}


		if(item=="pastries")
                {
		System.out.println("thank for ordering"   +item);
                return (45.00,quantity);
		}

		return 0.0;
	}

}








