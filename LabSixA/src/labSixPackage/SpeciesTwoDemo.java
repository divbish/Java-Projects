package labSixPackage;
public class SpeciesTwoDemo
{
    public static void main(String[] args)
    {
        SpeciesOneClass speciesOfTheMonth = new SpeciesOneClass();
        int futurePopulation;
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
              
        SpeciesOneClass secondSpecies = new SpeciesOneClass( );
        System.out.println("Enter data on another  Species of the Month:");
        secondSpecies.readInput();
                
        System.out.println ( "Trying to print out the information for the  FIRST animal" );
        speciesOfTheMonth.writeOutput ();
        futurePopulation = speciesOfTheMonth.populationIn10();
        System.out.println("In ten years the population will be " +
                                                 futurePopulation);      
        
        System.out.println ( "Trying to print out the information for the  SECOND animal" );
        secondSpecies.writeOutput ();     
        futurePopulation = secondSpecies.populationIn10();
        System.out.println("In ten years the population will be " +
                                                 futurePopulation);      
    }
}