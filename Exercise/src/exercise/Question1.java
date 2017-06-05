package exercise;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner (System.in);
		
		double salary,deduction,net;
		System.out.println("Enter salary and deduction");
		salary = keyboard.nextInt();
		deduction = keyboard.nextInt();		
	
		if (salary >= deduction)
		{
			System.out.println("ok") ;
		    net = salary - deduction; }
			
		else 
			System.out.println("No way");
		
	System.out.println(!(2 >= 1));
		
		
		 }
	}


