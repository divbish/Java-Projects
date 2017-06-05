package hw10;

public class MotorBoat {
	
	private double capacity;
	private double fuelAmount;
	public double maxSpeed;
	private double currentSpeed;
	private double efficiency;
	private double distance;
	
	public void setMotorVariables(double newCapacity, double newFuelAmount, double newMaxSpeed, double newEfficiency){
		setCapacity(newCapacity);
		setFuelAmount(newFuelAmount);
		setMaxSpeed(newMaxSpeed);
		setEfficiency(newEfficiency);
		
	}
	public void setFuelAmount(double newFuelAmount) {
		if (newFuelAmount>=0 && newFuelAmount < capacity)
			fuelAmount = newFuelAmount;
		else
			System.out.println("Enter valid fuelAmount");
	}
	public void setMaxSpeed(double newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double newcapacity) {
		capacity = newcapacity;
	}
	public double getFuelAmount() {
		return fuelAmount;
	}
	public void updateFuel(double time){
		fuelAmount = fuelAmount - (efficiency * currentSpeed * currentSpeed * time);
	}
	public void reFuelAmount(double newfuelAmount) {
		if (newfuelAmount>=0 && (fuelAmount + newfuelAmount)<capacity)
			fuelAmount = fuelAmount + newfuelAmount;
		else
			System.out.println("Enter valid fuelAmount");
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double newcurrentSpeed) {
		if (newcurrentSpeed>=0 && newcurrentSpeed<maxSpeed)
			currentSpeed = newcurrentSpeed;
		else
			System.out.println("Enter valid speed");
	}
	public double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(double newefficiency) {
		efficiency = newefficiency;
	}
	public double getDistance() {
		return distance;
	}
	public void distanceTraveled(double time) {
		updateFuel(time);
		distance = currentSpeed * time;
	}
	
	
	
}


