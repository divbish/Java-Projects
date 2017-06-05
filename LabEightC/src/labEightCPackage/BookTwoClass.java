package labEightCPackage;

import java.io.*;
import java.util.*;
public class BookTwoClass

{
  private  String title;
	private  String author;
	private  String genre;
	private  int quantity;


  public BookTwoClass()
	{
		title = "No title yet";
		author = "No author yet";
		genre = "no genre yet";
		quantity = -1;
	}
 public	BookTwoClass( String newBook, String newAuthor, String newGenre, int newQuantity)
	{
		  title = newBook;
		  author = newAuthor;
		  genre = newGenre;
		  quantity = newQuantity;
	}

public	BookTwoClass( String newBook)
	{
		title = "No title yet";
		author = "No author yet";
		genre = "no genre yet";
		quantity = -1;
	}

public	BookTwoClass ( int newQuantity)
	{
		 title = "no title yet";
		 author = "no author yet";
		 genre = " no genre yet";
		 quantity = -1;
	}

 public void getInput(BufferedReader input) throws IOException
	{


         title = input.readLine();
		 author = input. readLine();
		 genre = input.readLine();
		 String quantityString = input.readLine();
         quantity= Integer.parseInt(quantityString);
	}

public void writeOutput()
	{
		System.out.println( " Title " + getTitle());
		System.out.println( " Author is " + author);
		System.out.println ( " Genre is " + genre);
		System.out.println ( "Quantity is " + getQuantity ());
                System.out.println ();
	}

public void set( String newTitle, String newAuthor,
		               String newGenre, int newQuantity)
	{
		title = newTitle;
		author = newAuthor;
		genre = newGenre;
		quantity = newQuantity;
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
		  return title;
	}

public int getQuantity()
	{
		 return quantity;
	}

}