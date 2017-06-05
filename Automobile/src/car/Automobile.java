package car;

public class Automobile {
	double fuel;
	static final double mileage = 20;
	String owner;
	int vin;
	
	public void printAutomobileInfo(String owner){
		System.out.println("The owner is "+ owner);
	}
	
	public void calculateDistance(double fuel){
		double distance = mileage*fuel;
		System.out.println("The distance the car can go with "+fuel+" is "+distance+"miles");
		
	}

}
