package programAssignment2;

import java.util.Scanner;

public class AirlineLuggage {
	private double length;
	private double width;
	private double height;
	private double weight;
	private double size;
	
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the length ,width, height, and weight of your luggage ?");
		length = keyboard.nextDouble();
		width = keyboard.nextDouble();
		height = keyboard.nextDouble();
		weight = keyboard.nextDouble();
		
	}
		public double calculateOverSizeCost()
		{
			double cost =0;
			size = length + height + width;
			System.out.println("The length is "+length+", the width is "+width+", and the height is "+height+".");
			System.out.println("The dimensions "+length+" x "+width+" x "+height+" total "+size+" inches");

			if (size <= 62)
				{
				cost = 0.0;
				System.out.println("This piece is acceptable ");
				}

			else 
				{
				cost = 5.0;
				System.out.println("This piece is oversized and incurs a charge $" + cost);
				}
			return cost;
		}
		 public double getWeight()
		
		{
			return weight;
		}
		
		public double calculateOverWeightCost(double weight)
		{
			double weightCost =0 ;
			if (weight >=50)
				{
				weightCost =(weight - 50) * 2;
				System.out.println("The total weight is " + weight + " pounds which is " 
									+ (weight-50) + " pounds over the limit. The charge at $2 per pounds is $ "
									+ weightCost);
				}
		else
			System.out.println("The total weight is " + weight + " pounds which is acceptable.");
		return weightCost;
		
		}
		
	}


