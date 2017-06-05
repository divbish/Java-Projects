package labTenPackage;


import java.io.*;
public class BookStoreDemo
{	  public static void main(String arg[]) throws IOException
	  {
	 	BookStoreClass  PaceInventory = new BookStoreClass(10);
	  	PaceInventory.getData();
	  	PaceInventory.displayInventory();
	  	PaceInventory.updateInventory();
	  	PaceInventory.displayInventory();
	  	PaceInventory.deleteZero();
	  	PaceInventory.displayInventory();

	  }

}