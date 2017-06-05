package hw10;

import java.util.Scanner;
public class SpeciesFirstTryDemo {

	public static void main(String[] args) {
		SpeciesFirstTry speciesOfTheyear = new SpeciesFirstTry();
		double density;
		
		speciesOfTheyear.readInput();
		speciesOfTheyear.writeOutput();
		density = speciesOfTheyear.getDensity(90.0);
		System.out.println("DENSITY IS " + density);
		
	}

}
