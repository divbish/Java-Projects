package hw10;

public class MotorBoatTest {

	public static void main(String[] args) {
		MotorBoat testMotor = new MotorBoat();
		testMotor.setMotorVariables(30, 10, 100, 0.0002);
		testMotor.setCurrentSpeed(120);
		testMotor.setCurrentSpeed(90);
		System.out.println(testMotor.getCurrentSpeed() == 90);
		double fuelBeforeOperating = testMotor.getFuelAmount();
		testMotor.distanceTraveled(1);
		System.out.println(testMotor.getDistance() == 90);
		double fuelAfterOperating = testMotor.getFuelAmount();
		System.out.println(fuelAfterOperating<=fuelBeforeOperating);
		double fuelBeforeRefill = testMotor.getFuelAmount();
		testMotor.reFuelAmount(10);
		double fuelAfterRefill = testMotor.getFuelAmount();
		System.out.println(fuelBeforeRefill<=fuelAfterRefill);
	}

}
