package labThreePackage; 
import java.text.*;
import java.util.Scanner;
public class PhoneCall
{
   public static void main (String[] args)

    {
     Scanner keyboard = new Scanner (System.in);
       double startTime, regularPrice, discountedPrice;
       System.out.println("What is the starting time of the phone call?");
       startTime = keyboard.Double();

       System.out.println("What is the length of the phone call?");
       length = keyboard.nextDouble();

       regularPrice = length * .40;


       //figuring out discount

       if ( startTime >=1800)
        discountedPrice = regularPrice * .50;
       else if ( startTime <=800)
        _______________________________________;
       else
       	discountedPrice = regularPrice;



       // the following lines of code change the double discountedPrice to a string
       // dPrice with two decimal places for the purpose of printing out
       DecimalFormat decFor = new DecimalFormat();
       decFor.setMaximumFractionDigits(2);
       decFor.setMinimumFractionDigits(2);
       String dPrice =decFor.format(discountedPrice);

       System.out.println( "The discounted price is " + dPrice);
     }
}

