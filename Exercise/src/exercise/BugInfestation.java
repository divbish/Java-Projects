package exercise;

import java.util.Scanner;

public class BugInfestation {
	public static final double GROWTH_RATE = 0.95; //95% per week 
	public static final double ONE_BUG_VOLUME = 0.002; //cubic feet

	public static void main(String[] args) {
		System.out.println("Enter the total volume of your house");
        System.out.print("in cubic feet: ");
        Scanner keyboard = new Scanner(System.in);//object or instance of Scanner class
        double houseVolume = keyboard.nextDouble();//nextDouble is a method of Scanner class
        System.out.println("Enter the estimated number of");
        System.out.print("roaches in your house: ");
        double population = keyboard.nextDouble();
        System.out.println("Starting with a roach population of " +
		        (int)population);
        int countWeeks = 0;
//        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOLUME;
        double newBugs, newBugVolume;
		while (totalBugVolume < houseVolume)
		{
		    newBugs = population * GROWTH_RATE;
		    newBugVolume = newBugs * ONE_BUG_VOLUME;
		    population = population + newBugs;
		    totalBugVolume = totalBugVolume + newBugVolume;
		    countWeeks++;
		}
		System.out.println("and a house with a volume of " + houseVolume +
		        " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with " +
		        (int)population + " roaches.");
		System.out.println("They will fill a volume of " +
		        (int)totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
	}


}
