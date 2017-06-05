//lab #6   from Chapter 4 example

public class SpeciesTwoDemo
{
    public static void main(String[] args)
    {
        SpeciesOneClass speciesOfTheMonth = new SpeciesOneClass();
        int futurePopulation;
        
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
              
        
         
        // the following code will be changed later
        System.out.println("Enter data on another  Species of the Month:");
        speciesOfTheMonth.readInput();
        
                
                                                 
        System.out.println ( "Trying to print out the information for the  FIRST animal" );
        speciesOfTheMonth.writeOutput ();
        
        System.out.println ( "Trying to print out the information for the  SECOND animal" );
        speciesOfTheMonth.writeOutput ();                                                           
    }
}