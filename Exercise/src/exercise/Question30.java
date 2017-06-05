package exercise;
import java.util.Scanner;
public class Question30 {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double salary, bonus;
		final double MIN_SALARY = 5000, MIN_BONUS = 1000;
		System.out.println("salary and bonus");
		salary = keyboard.nextDouble();
		bonus = keyboard.nextDouble();
		if ((salary >= MIN_SALARY) || (bonus >= MIN_BONUS))
			System.out.println("OK");	
		else 
			System.out.println("Too Low");
		System.out.println("the salary and bonus is too low");
	}

}
