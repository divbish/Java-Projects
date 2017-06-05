package labSixPackage;
public class SpeciesOneDemo
{
    public static void main(String[] args)
    {
        SpeciesOneClass speciesOfTheMonth = new SpeciesOneClass();
        int futurePopulation;
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 
        
        futurePopulation = speciesOfTheMonth.populationIn10();
        System.out.println("In ten years the population will be " +
                                                 futurePopulation);                    
    }
}