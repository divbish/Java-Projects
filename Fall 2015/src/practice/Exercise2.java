package practice;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {

		double dollar=0.0;
		double halfAdollar=0.0;
		double quarters=0.0;
		double dims=0.0;
		double cents = 0.0;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How many dollar bills?");
	dollar = keyboard.nextDouble();
	System.out.println("How many half a dollars?");
	halfAdollar = keyboard.nextDouble();
	System.out.println("How many quarters?");
	quarters = keyboard.nextDouble();
	System.out.println("How many cents?");
	cents = keyboard.nextDouble();
	
	double totalcents = (dollar*100 + halfAdollar*50 + quarters* + cents*1);
	
	System.out.println("The total in cents is " + totalcents);

		
	}

	
}
