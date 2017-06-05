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
        
        futurePopulation = speciesOfTheMonth.projectedPopulation(10);
        System.out.println("In "+10+ " years the population will be " +
                                                    futurePopulation);
       
        
    }
}