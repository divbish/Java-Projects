package programAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramAssignment1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		DecimalFormat deciFor = new DecimalFormat();
		deciFor.setMaximumFractionDigits(6);
		deciFor.setMinimumFractionDigits(6);
		double BMI,weight,height,kg,meter;
		weight = 130;
		height = 67;
		kg = weight * 0.4536;
		meter = height * 0.0254;
		BMI = kg / (meter * meter);
		System.out.printf("The weight is %3.1f pound(s) or %3.0f kilogram(s)" ,weight, kg);
    	System.out.printf("\nThe height is %3.1f inches or %3.4f meter(s)" ,height, meter);
        System.out.println("\nThe Body Mass Index is " + BMI);
        while (true)
        {
	        System.out.println("\nEnter your weight and height");
	        weight = keyboard.nextDouble();
	        height = keyboard.nextDouble();
	        
	        if ((height<=0)||(weight <=0))
	        	System.out.println("You entered invalid height or weight");
	        
	        else
	        {
	        	kg = weight * 0.4536;
				meter = height * 0.0254;
		    	BMI = kg / (meter * meter);
		    	System.out.printf("The weight is %3.2f pound(s) or %3.2f kilogram(s)" ,weight, kg);
		    	System.out.printf("\nThe height is %3.2f inches or %3.2f meter(s)" ,height, meter);
		        System.out.println("\nThe Body Mass Index is " + deciFor.format(BMI) );
		        if (BMI < 18.5)
		        	System.out.println("you are underweight");
		        else if(BMI >=18.5 && BMI <= 24.9) 
		        		System.out.println("you are healthy weight");
		        else if(BMI >= 25 && BMI <=29.9) 
		        		System.out.println("you are overweight");
		        else
	            	System.out.println("you are obese");
		   
		        	
		     }
        }
        
	}

}
