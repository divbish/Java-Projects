package lab3Package; 
import java.text.*;
import java.util.Scanner;
public class PhoneCall
{
   public static void main (String[] args)

    {
     Scanner keyboard = new Scanner (System.in);
     DecimalFormat decFor = new DecimalFormat();
     decFor.setMaximumFractionDigits(2);
     decFor.setMinimumFractionDigits(2);
       double startTime,length, regularPrice, discountedPrice=0,tax,finalPrice;
       String choice;
       while(true)
       {   
    	   System.out.println(" Do you want to run this program or not. Enter Y for yes and N for no");
    	   choice = keyboard.next();
    	   if (choice.toUpperCase().equals("Y"))
    	   {
    		   
    	    System.out.println("\n\nWhat is the starting time of the phone call?");
	       startTime = keyboard.nextDouble();
	       //applying discounts to calculate final price
	       if ((startTime>= 2400) || (startTime <0))
	    	   System.out.println("enter valid time");
	       else { 
	    	   System.out.println("What is the length of the phone call?");
	           length = keyboard.nextDouble();
	           if (length<0)
	        	   System.out.println("enter valid length");
	           else{	 
	        	   regularPrice = length * 0.40;
	           		System.out.println("Regular price is " + decFor.format(regularPrice));
	           		if (( startTime >=0 && startTime <=800) || (startTime >=1800 && startTime < 2400))
	           			discountedPrice = regularPrice * 0.50;
	           		else
	           			discountedPrice = regularPrice;
	           		//discount price 15% if call is over 60 mins
	           		if (length >60)
	           			discountedPrice = discountedPrice - 0.15 * discountedPrice;
	           		System.out.println("discountedPrice is" +  decFor.format(discountedPrice));
	           		//all phone calls to a 6.5% tax
	           		finalPrice = discountedPrice * 0.065 + discountedPrice;
	           		System.out.println("final price is" + decFor.format(finalPrice));
	           }
	       }
	       }
    	   else
    		   break;
	     }
    }
}

