package question6;

import java.util.Scanner;

public class Quiz1Demo {
	
	public static void main ( String [] args)
	{
	double salary, taxesOwed;
	Scanner keyboard = new Scanner (System.in);
	Quiz1  taxReturn = new Quiz1 ( );
	System.out.println ( "Enter the salary earned ");
	
	salary = keyboard.nextDouble(); //_________________________________________________________ (4)
	// on the next line write the statement that calls the method findTaxes
	taxesOwed=taxReturn.findTaxes(salary); //_____________________________________________________________(5)
	System.out.println ( "The tax amount that is owed is  " + taxesOwed );

	} }
