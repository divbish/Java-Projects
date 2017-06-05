package exercise;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		//System.out.println("abc\ndef");
//		String name = "vikram bishnoi";
//		System.out.println(name.substring(1,9));
//		String s1="Hello John";
//		String s2="hello john";
//		System.out.println(s1.equalsIgnoreCase(s2));
//		String s = "hello" + "" + "Joe";
//		System.out.println(s);
		
	


		                int score;

		System.out.println("Enter score");

		score = keyboard.nextInt();

		if ((score > 0) && (score <100))

		System.out.println("Valid test score");

		else 

		System.out.println("Invalid test score");

		}

	}


