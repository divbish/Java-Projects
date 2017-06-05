package lab9BPackage;

import java.io.*;
public class BookClassOneDemo
{	  public static void main(String arg[]) throws IOException
	  {
	 	BookStoreOneClass  PaceInventory = new BookStoreOneClass(10);
	  	PaceInventory.getData();
	  	PaceInventory.displayInventory();
	  	PaceInventory.displayReverseInventory();


	  }

}