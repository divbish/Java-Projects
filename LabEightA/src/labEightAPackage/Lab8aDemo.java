package labEightAPackage;

import java.io.*;
import java.util.*;
public class Lab8aDemo
{
	 public static void main (String[] args) 
	{
		 BookOneClass favoriteBook = new BookOneClass();
		favoriteBook.getInput();
		favoriteBook.set("The Great Gatsby");
		favoriteBook.writeOutput();

	}
}