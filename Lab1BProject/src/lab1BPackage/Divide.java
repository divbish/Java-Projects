package lab1BPackage;
import   java.util.Scanner;
public class Divide
{
	public static void main (String [] argsf)
	{ 
	   int numerator, denominator,  quotient;
       Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter the numerator" );	  
	   numerator = keyboard.nextInt();
	   System.out.println ("Enter the denominator");
	   denominator = keyboard.nextInt();
	   System.out.println ( "Enter the quotient of " + numerator + "divided by " + denominator);
	   quotient = keyboard.nextInt ();
	   if ( quotient == numerator/ denominator )
	     System.out.println ( " You are correct" );
	   else
	   {
	     System.out.println ( " You are incorrect" );
		 System.out.println ( " The correct answer is " + ( numerator/denominator) );
	   } 
	}
} 
