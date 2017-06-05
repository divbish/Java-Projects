 //divya bishnoi
package lab1Package;
 import java.util.Scanner;
 public class Multiply
 {
   public static void main (String [] args)
   {
      int first, second, product; 
      Scanner keyboard = new Scanner (System.in);
      System.out.println ("Enter the first integer" );
      first = keyboard.nextInt();
      System.out.println ("Enter the second integer" );
      second = keyboard.nextInt();
      System.out.println ( "Enter the product of " + first + " and " + second );
      product =keyboard.nextInt ();
      if ( product == first * second )
        System.out.println ("You are correct" );
      else
      {
         System.out.println ( "You are incorrect" );
         System.out.println ( "The correct answer is " + (first * second ) );
       }
    }
  }
    
