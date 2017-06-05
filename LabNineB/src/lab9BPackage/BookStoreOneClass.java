package lab9BPackage;

import java.io.*;
public class BookStoreOneClass
{
        private  int [] quantity;
	    private String[] list;
        private int numTitles;

 public  BookStoreOneClass ( int size)
	{      numTitles = size;
           quantity = new int[size];
           list = new String [size];

        }

	public void getData( ) throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/LabNine/inventory.txt"));
        String numTitlesString =input.readLine();
        numTitles = Integer.parseInt(numTitlesString);
        String quantityString;
        for(int i = 0; i <numTitles; i++)
		{
        	//System.out.println ( "When i is " + i + " " + list[i]) ; 
			 list[i] = input.readLine();
			 quantity[i] = Integer.parseInt(input.readLine()); 
		}
	}
	public void displayInventory()
	 {
	   System.out.println( "The inventory is now");
	   System.out.println( "Quantity            Title");
	   for (int  i = 0; i <numTitles; i++)
	   System.out.println(list[i] + "        \t " + quantity[i]);
	 }
	public void displayReverseInventory()
	 {
	   System.out.println( "The Reverse inventory is ");
	   System.out.println( "Quantity            Title");
	   for (int  i = numTitles-1; i >=0; i--)
	  	System.out.println(list[i] + "        \t " + quantity[i]);
	 }


	
	
}