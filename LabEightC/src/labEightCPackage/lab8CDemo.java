package labEightCPackage;

import java.io.*;
public class lab8CDemo
{
	 public static void main(String [] args) throws IOException
	{
		BookTwoClass  favoriteBook = new BookTwoClass();
		BookTwoClass  leastFavorite =new BookTwoClass("Discrete Mathematics", "Einstein", "nonfiction", 5045);

        BufferedReader input = new BufferedReader ( new FileReader ("/Users/divyabishnoi/Documents/Eclipse2015/LabEight/books.txt")); 
		favoriteBook.getInput(input);
		System.out.println ( "The original values of favorite book");
		favoriteBook.writeOutput();

		System.out.println();
		System.out.println("The original values of least favorite book");
		leastFavorite.writeOutput();


		leastFavorite = favoriteBook;
		leastFavorite.set("Advanced Calculus", "Newton", "nonfiction", 435);
		System.out.println();
		System.out.println( " Does your favorite book get changed?");

		System.out.println( "The new values of favorite book");
		favoriteBook.writeOutput();

	        System.out.println();
		System.out.println("The new values of least favorite book");
		leastFavorite.writeOutput();
	}

}
