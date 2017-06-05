package lab3Package;

import java.util.Scanner;

public class Learning {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		double volume,radius,cost=0, height=0;
		final double PI=22.0/7;
		System.out.println("Enter -99 to exit the program at any time or enter any other integer to continue");
		int choice = keyboard.nextInt();
		while(choice != -99)
		{
			System.out.println("Enter radius and volume");
			volume=keyboard.nextDouble();
			radius=keyboard.nextDouble();
			if ((volume <=0) || (radius <=0))
			{
				System.out.println("you entered invalid volume or radius");
				break;
			}
			else{
				cost = 2 * PI * radius * (radius+height);
				height = volume/(PI*radius*radius);
				System.out.printf("HEIGHT IS %3.2f\n", height );
				System.out.printf("COST IS %3.2f\n", cost );
				System.out.println("Enter -99 to exit the program or enter any other integer to continue");
				choice = keyboard.nextInt();
			}
		}	
	}

}