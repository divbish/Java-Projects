package array;
import java.util.Scanner;

public class ListDemo {
	public static void main(String [] args )
	{
          int number, position;
          ListClass numberList = new ListClass();
          System.out.println( "For what number are you searching?");
          Scanner keyboard = new Scanner (System.in );  
          number= keyboard.nextInt () ;  
          position = numberList.search ( number);
          
          if ( position != -1){
             System.out.println(  number + "was found at position " + position  );
             }
          else 
             System.out.println ( number + " was never found:" );

	}}
