package lab3Package;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		double dollar;
		System.out.print("enter dollar");
		dollar = keyboard.nextDouble();
		DecimalFormat cents = new DecimalFormat();
		cents.setMaximumFractionDigits(2);
		cents.setMinimumFractionDigits(2);
		System.out.print(cents.format(dollar));
	}

}
