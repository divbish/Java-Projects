package lab3Package;
import java.util.Scanner;

public class Hw7 
{
	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner (System.in);
         double sum=0,average=0;
         System.out.print("Enter a decimel number with a sentinel value at the end");
         double number=keyboard.nextDouble() ;
         int count=0;
		 while (number>0.9)
			{
			 sum = sum +number;
			 System.out.print("Enter a decimel number with a sentinel value at the end");
	         number=keyboard.nextDouble();
			 count++;
			} 
		 if (count>0){
		 average = sum/count;
		 System.out.println("result is " + average);
		 }
		 else
			 System.out.println("nothing to average");
	}
}