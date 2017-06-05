package hw10;
import java.util.Scanner;

public class SpeciesFirstTry {
	public String name;
	public int speciesId;
	public int population;
	public double growthRate;
	
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what is the species name");
		name = keyboard.nextLine();
		System.out.println("what is the speciesId?");
		speciesId = keyboard.nextInt();
		System.out.println("what is the population of the species?");
		population = keyboard.nextInt();
		System.out.println("Enter growth rate"+"percent increase per year");
		growthRate = keyboard.nextDouble();
	}
	public void writeOutput()
	{
		System.out.println("name = "+name);
		System.out.println("speciesId = "+speciesId);
		System.out.println("population = "+population);
		System.out.println("growthRate = "+growthRate+"%");
	}
	
	public int getPopulationIn10()
	{
		int result = 0;
		double populationAmount = population;
		int count = 10;
		while((count>0) && (population>0))
		{
			populationAmount = populationAmount+(growthRate/100) * populationAmount;
			count--;
		}
		if(populationAmount>0)
			result = (int)populationAmount;
		return result;
	}
	
	public double getDensity(double area)
	{
		double density = population / area;
		return density;	
	}

}
