package labSixCPackage;

import java.util.Scanner;

/******************************************************************
 *Demonstrates the use of a parameter with the method projectedPopulation.
 ******************************************************************/
public class SpeciesThreeDemo
{
    public static void main(String[] args)
    {
        SpeciesThreeClass speciesOfTheMonth = new SpeciesThreeClass();
        int futurePopulation;
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 
        int time;
        System.out.println("State the number of years to project the new population");
        Scanner keyboard = new Scanner(System.in);
		time = keyboard.nextInt ( );
        futurePopulation = speciesOfTheMonth.projectedPopulation(time);
        System.out.println("In "+time+ " years the population will be " +
                                                    futurePopulation);
    }
}