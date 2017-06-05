package discussionBoard;
import java.util.Scanner;
public class page130 {
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	
	System.out.println("Enter a four-digit integer");
	int number,number1,number2,number3;
	number = keyboard.nextInt ();
	number1 = number / (10 * 10 * 10);
	number = number % (10 * 10 * 10);
	number2 = number / (10 * 10);
	number = number % (10 * 10);
	number3 = number / 10;
	number = number % 10;
	System.out.print(number1+ "\n" +number2+ "\n" +number3+ "\n" +number);
		
}
}