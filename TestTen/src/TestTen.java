import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestTen {
	private String [ ] itemName  = new String [10];
	private double [ ] storeOne = new double [10];
	private double [ ] storeTwo = new double [10];
	
	public void readInput() throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/LabNine/drugstore.txt"));
		for (int i = 0; i< 10; i++)
		{
			itemName [i] = input.readLine();
			storeOne [i] = Double.parseDouble(input.readLine());
			storeTwo [i] = Double.parseDouble(input.readLine());
		}
		
	}
	
	public void displayList()
	{
	   System.out.println( "The data read from the file is : ");
	   for (int  i = 0; i < 10; i++){
	     System.out.println( itemName[i]);
	     System.out.println( storeOne[i]);
	     System.out.println( storeTwo[i]);
	   }
	}
	
}
