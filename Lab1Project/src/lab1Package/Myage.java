package lab1Package;

import java.util.Scanner;

public class Myage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age;
//		Scanner keyboard = new Scanner (System.in);
//		System.out.println("Enter your age");
//        age = keyboard.nextInt ( );
//       
//		System.out.println ("Your age is");
//		System.out.println (age);
//		System.out.println("Enter your brother's age");
//		age = keyboard.nextInt ( );
//		System.out.println ("Your brother's age is");
//		System.out.println (age);
        double interest,balance,rate; 
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("enter balance");
        balance = keyboard.nextDouble();
        System.out.println ("enter rate");
        rate = keyboard.nextDouble();
        interest = balance * rate;
        System.out.println ("The value of interest is " + interest);
        balance = 200;
        rate = 50;
        interest = balance * rate;
        System.out.println ("The value of interest is " + interest);
	}

}
