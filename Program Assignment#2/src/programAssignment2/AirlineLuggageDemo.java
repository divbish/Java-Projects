package programAssignment2;

import java.util.Scanner;

public class AirlineLuggageDemo {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("How many bags you are carrying?");
		int luggageCount = keyboard.nextInt();
		int i;
		double weight=0;
		double weightCost=0;
		double overSizeCost = 0;
		double OverWeightCost =0;
		for(i=0; i<luggageCount; i++)
		{
			AirlineLuggage luggage = new AirlineLuggage();
			luggage.readInput();
			weight = weight + luggage.getWeight();
			overSizeCost = overSizeCost + luggage.calculateOverSizeCost();
			OverWeightCost = luggage.calculateOverWeightCost(weight);
		}
		
		System.out.println("Total cost is $"+(overSizeCost + OverWeightCost));
		
	}

}
