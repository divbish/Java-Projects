package cookieWinner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CookiesWinner 
{
	private String [] teacherName;
	private int [] soldBoxes;
	private int count;
	
	public CookiesWinner(int size)
	{
		teacherName = new String [size];
		soldBoxes = new int [size];
		count=size;
	}
	
	public void readInput() throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/Program Assignment/update.txt"));
		for ( int i = 0; i < count ; i++) 
		{  
		teacherName[i] = input.readLine();
        soldBoxes[i] = Integer.parseInt(input.readLine());
		}
	}
	public void displaySalesList ()
	{
		System.out.println( "The Sales list of Cookies is : ");
		for (int  i = 0; i < count; i++)
		{
		     System.out.println( teacherName [i]);
		     System.out.println( soldBoxes [i]);
	    }
	}
}
