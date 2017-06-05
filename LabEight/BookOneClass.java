import java.io.*;
import java.util.*;
public class BookOneClass
{
	private  String title;
        private  String author;
	private  String genre;
	private  int quantity;




  public void getInput() 
      {  
         Scanner keyboard = new Scanner (System.in) ; 
		 System.out.println( "Enter title");
		 _________________________________________________
		 System.out.println( "Enter author" );
		 author = keyboard. nextLine();
		 System.out.println( "What type of book is it? biography,fiction?");
		 genre = keyboard.nextLine();
		 System.out.println ("How many copies are in the book store?");
		 String quantity= keyboard.nextInt();
		
	}



	public void writeOutput()
	{
		System.out.println( " Title " + title);
		System.out.println( " Author is " + author);
		System.out.println ( " Genre is " + genre);
		System.out.println ( "Quantity is " + quantity);
	}




	public void set( String newTitle, String newAuthor,
		               String newGenre, int newQuantity)
	{
		title =_____________________
		author = _____________________;
		genre = __________________;
		quantity = ___________________;
	}



	public void set (String newTitle)
	{
		  title = newTitle;
	}



	public void set ( int newQuantity)
	{
		quantity = newQuantity;
	}



	public String getTitle()
	{
		  return __________________________
	}


	public int  getQuantity()
	{
		 return quantity;
	}


}