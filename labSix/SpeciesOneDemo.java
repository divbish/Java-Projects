//lab #6   from Chapter 4 example

public class SpeciesOneDemo
{
    public static void main(String[] args)
    {
        SpeciesOneClass speciesOfTheMonth = new SpeciesOneClass();
        int futurePopulation;
        
        
       
         // after figuring out the first syntax error delete from here to next comment
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput(); 
        System.out.println("In ten years the population will be " +
                              speciesOfTheMonth.populationIn10());
        // end of code to delete   
        
        
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 
        
        futurePopulation = speciesOfTheMonth.populationIn10();
        System.out.println("In ten years the population will be " +
                                                 futurePopulation);                    
    }
}