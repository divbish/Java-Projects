package practice;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		String name;
		Double income, incomeTax;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name");
		name = keyboard.nextLine();
		System.out.println("Enter your income");
		income = keyboard.nextDouble();
		incomeTax = calculate(income);
		System.out.println(name + " pay " + incomeTax + " for your tax.");
	}

	private static double calculate(double income) {
		if (income < 30000)
			return 0;
		else if (income < 100000)
			return 15.0 / 100 * income;
		else
			return 25.0 / 100 * income;

	}

}
