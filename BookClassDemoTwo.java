import java.io.*;
public class BookClassDemoTwo
{	  public static void main(String arg[]) throws IOException
	  {
	 	BookStoreClassTwo  PaceInventory = new BookStoreClass(10);
	  	PaceInventory.getData();
	  	PaceInventory.displayInventory();
        PaceInventory.updateInventory();
        PaceInventory.displayInventory();



	  }

}