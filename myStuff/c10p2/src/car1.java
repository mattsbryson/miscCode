
public class car1 {

	public static void main(String[] args) {
		sport c1 = new sport();
		c1.setVehicle(true);
		c1.setCar(true);
		c1.setsport(true);
		c1.setNsport("Ferrari");
		
		
		
		System.out.println("Your car is a vehicle: " + c1.getVehicle());
		System.out.println("Your car is a car: " + c1.getCar());
		System.out.println("Your car is a sports car: " + c1.getsport());
		System.out.println("Your car is a " + c1.getNsport());
	}

}
