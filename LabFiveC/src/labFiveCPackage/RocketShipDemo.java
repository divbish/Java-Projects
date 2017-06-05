package labFiveCPackage;

public class RocketShipDemo {

	public static void main(String[] args) 
	{
		int i =0;
		RocketShip rocket = new RocketShip();
		
		rocket.drawTriangle();
		rocket.drawBase();
		for (i = 0; i<3; i++)
			rocket.combination();
		rocket.drawTriangle();
	}

}
