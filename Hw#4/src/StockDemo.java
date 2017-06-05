import java.util.Scanner;


	public class StockDemo
	{  public static void main ( String [ ] args)  
	    {    
	         String name;
	         double price;
	         int numberOfStocks;  
	         Scanner keyboard = new Scanner (System.in ); 

	         System.out.println ("What is the name of the stock that you want to buy?");
	          name = keyboard.nextLine ( ); 

	          StockClass stocks = new StockClass ( name, 0 ,0, " January -2, 2000");// name of the stock, quantity and 
	                                                             //price  and date of the stock
	         System.out.println ( "How many stock are you buying today?");
	        numberOfStocks = keyboard.nextInt ();
	        System.out.println ("What is the price of the entire stock  which you are buying today");
	        price = keyboard.nextDouble ( );
	        stocks.add  ( numberOfStocks, price );

	        stocks.print ( );

	        System.out.println (" How many stock are you selling today?");
	        numberOfStocks = keyboard.nextInt ( );
	        System.out.println ( "What is the price of the entire stock  which you are selling today");
	        price = keyboard.nextDouble ( );
	        stocks.sell ( numberOfStocks,price );

	        if ( stocks.worthwhile ( )  )
	           System.out.println ( "I am in the money") ;
	        else
	            System.out.println ( " I will stop spending needlessly" );
	   }
	}




