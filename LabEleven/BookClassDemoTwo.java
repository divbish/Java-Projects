import java.io.*;
public class BookClassDemoTwo
{	  public static void main(String arg[]) throws IOException
	  {
	 	BookStoreClassTwo  PaceInventory = new BookStoreClassTwo(10);
	  	PaceInventory.getData();
	  	PaceInventory.displayInventory();
        PaceInventory.updateInventory();
        PaceInventory.displayInventory();
        PaceInventory.sortByTitle();
        PaceInventory.displayInventory();
        PaceInventory.sortByQuantity();
        PaceInventory.displayInventory();
	  }

}