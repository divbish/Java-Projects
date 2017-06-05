package labTwoPackage;
import java.util.Scanner;
public class Circles {
	

	public static void main(String[] args) 	
	{
		Scanner keyboard = new Scanner (System.in);
		final double PT = 3.14;
		double area, radius, circumference;
		double pi = 22.0/7;
		System.out.println ("What is the radius of your circle?");
		radius = keyboard.nextDouble ( );
		area = PT * radius * radius;
		System.out.println ("The area using PT is " + area);
		area = pi * radius * radius;
		System.out.println ("The area using pi is " + area);
	    circumference = 2 * pi * radius;
		
	  
	}

}
