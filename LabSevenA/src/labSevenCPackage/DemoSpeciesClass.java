package labSevenCPackage;
import java.util.Scanner; 
/******************************************************************
 *This is a version of the class Species, but is only a toy example
 *designed to demonstrate the difference between parameters of
 * a class type and parameters of a primitive type.
 *****************************************************************/
public class DemoSpeciesClass
{
	  private String name;
    private int population;
    private double growthRate;
	
    /****************************************************
     *Precondition: Calling object has been given values.
     *Postcondition: otherObject has the same data as the 
     *calling object. The calling object is unchanged.
     ****************************************************/
    public void makeEqual(DemoSpeciesClass otherObject)
    {
        otherObject.name = name;
        otherObject.population = population;
        otherObject.growthRate = growthRate;
    }
   
    /*****************************************************
     *Tries to set intVariable equal to the population of
     *the calling object. But it cannot succeed, because 
     *arguments of a primitive type cannot be changed.
     *****************************************************/
    public void tryToMakeEqual(int intVariable)
    {
        intVariable = this.population;
        System.out.println( " the value of intVariable inside of tryToMakeEqual is " + intVariable);
    }
   
    public boolean equals(DemoSpeciesClass otherObject) 
    {
        return ((name.equalsIgnoreCase(otherObject.name))
                && (population == otherObject.population)
                && (growthRate == otherObject.growthRate));
    }

    public void readInput() 
    {
    	Scanner keyboard = new Scanner (System.in);
        System.out.println("What is the species' name?"); 
        name = keyboard.nextLine();
        System.out.println("What is the population of the species?"); 
        population = keyboard.nextInt(); 
        System.out.println("Enter growth rate (percent increase per year):");
        growthRate = keyboard.nextDouble(); 
    }

    public void writeOutput()
    {
         System.out.println("Name = " + name); 
         System.out.println("Population = " + population); 
         System.out.println("Growth rate = " + growthRate + "%"); 
    }

















    /**********************************************************
     *Precondition: years is a nonnegative number.
     *Returns the projected population of the calling object
     *after the specified number of years.
     **********************************************************/
    public int projectedPopulation(int years)
    {
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount + 
                          (growthRate/100) * populationAmount);
            count--;
        }
   
        if (populationAmount > 0)
            return (int)populationAmount;
        else
            return 0;
    }

    public void set(String newName, int newPopulation,
                       double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else
            System.out.println("ERROR: using a negative population.");
        growthRate = newGrowthRate;
    }

    public String speciesName()
    {
        return name;
    }

    public int speciesPopulation()
    {
        return population;
    }

    public double speciesGrowthRate()
    {
        return growthRate;
    }

   
    
}