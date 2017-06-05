package exercise;
import java.util.Scanner;
public class Ifelse1 {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double salary,bonous,MIN_SALARY = 5000,MIN_BONOUS = 1000;
		System.out.println("Enter salary and bonous");
		salary = keyboard.nextInt();
		bonous = keyboard.nextInt();
		if ((salary >= MIN_SALARY) || (bonous >= MIN_BONOUS))
			
			System.out.println("OK");
			
		else 
			System.out.println("Too Low");
	}

}
