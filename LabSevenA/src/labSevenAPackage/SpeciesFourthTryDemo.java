package labSevenAPackage;
import java.util.Scanner; 
/**********************************************
 *Demonstrates the use of accessor method set.
 **********************************************/


public class SpeciesFourthTryDemo
{
    public static void main(String[] args)
    {   Scanner keyboard = new Scanner (System.in);
        SpeciesFourthTryClass speciesOfTheMonth = new SpeciesFourthTryClass();
        int numberOfYears, futurePopulation;

        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();


        System.out.println("Enter number of years to project population:");
        numberOfYears = keyboard.nextInt();

        futurePopulation =
                 speciesOfTheMonth.projectedPopulation(numberOfYears);
        System.out.println("In " + numberOfYears
                + " years the population will be " + futurePopulation);

        System.out.println("Getting a new species of the month" );
        System.out.println("Attempting to assign values to the private member variables in the main");
        speciesOfTheMonth.set("Klingon ox", 10, 15);

        for ( int i = 1; i <+5; i ++)
           System.out.println ();

        System.out.println("The new Species of the Month:");
//        speciesOfTheMonth.writeOutput () ;
        System.out.println( "Name = " + speciesOfTheMonth.getName( ) ) ;
        System.out.println( "Population = " + speciesOfTheMonth.getPopulation( ) ) ;
        System.out.println( "Growth rate = " + speciesOfTheMonth.getGrowthRate( ) ) ;

        System.out.println ( "State the number of years to project the population of " + speciesOfTheMonth.getName () );
        numberOfYears = keyboard.nextInt();
        System.out.println("In " + numberOfYears
              + " years the population for " + speciesOfTheMonth.getName () + " will be "
               + speciesOfTheMonth.projectedPopulation(numberOfYears));
     }
}