import java.util.Scanner; 
public class SpeciesOneClass
{   
	
	private String name;
    private int population;
    private double growthRate;
    
    public void readInput()
    {   Scanner keyboard = new Scanner(System.in); 
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

    public int populationIn10()
    {
        double populationAmount = population;
        int count = 10;
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
    
    
}