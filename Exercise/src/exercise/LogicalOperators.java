package exercise;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		int goals,errors;
		System.out.println("Enter goals and errors");
		goals = keyboard.nextInt();
		errors = keyboard.nextInt();
		
		if ((goals > 10) || (errors == 0))
			System.out.println("Wow");
			
		else 
			System.out.println("Oh Well");
		

	}

}
