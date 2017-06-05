import java.io.*;
public class ArrayListClass
{
  private  int numFaculty;
	private String [] list;


  public ArrayListClass ()
	{

	}


	public void getData() throws IOException
	{
		BufferedReader input = new BufferedReader(new FileReader("faculty.txt"));
                String str = input.readLine();
		numFaculty  = Integer.parseInt(str);

		list = new String [numFaculty];


		for(int i = 0; i < numFaculty; i++)
		{
			list[i]= input.readLine();
		}
	}



	public void displayList()
	{
	   System.out.println( "The list of CS faculty  is now");
	   for (int  i = numFaculty -1; i >=0; i--)
	     System.out.println( list[i]);
	}




}