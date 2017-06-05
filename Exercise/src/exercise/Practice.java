package exercise;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner (System.in);
		double amount,serviceCharge=0;		
		System.out.println("Enter check amount");
		amount= keyboard.nextDouble();
	
	    if (amount < 0)
	    	System.out.println("INVALID CHECK AMOUNT");
	    else if (amount < 10)
			serviceCharge = 1;
		else if ((amount < 100) && (amount >= 10))
			serviceCharge = 0.1 * amount;
		else if ((amount < 1000) && (amount >=100))
			serviceCharge = 5 + 0.05 * amount;	
		else 
			serviceCharge = 40 + 0.01 * amount;
		System.out.println("Service charege is" + serviceCharge);

	}

}
