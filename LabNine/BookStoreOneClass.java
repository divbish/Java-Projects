import java.io.*;
public class BookStoreOneClass
{
        private  int [] quantity;
	    private String[] list;
        private int numTitles;

 public  BookStoreOneClass ( int size)
	{      numTitles = size;
           quantity = new int[size];
           

        }

	public void getData( ) throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("inventory.txt"));
        String numTitlesString =input.readLine();
        numTitles = Integer.parseInt(numTitlesString);
        String quantityString;
        for(int i = 0; i <= numTitles; i++)
		{
			 list[i] = input.readLine();
             
			 quantity[i] = input.readLine();  
		}
	}

	public void displayInventory()
	 {
	   System.out.println( "The inventory is now");
	   System.out.println( "Quantity            Title");
	   for (int  i = 0; i <numTitles; i++)
	   	System.out.println(list[i] + "        \t " + quantity[i]);
	 }

	
	
}