import java.io.*;
public class BookStoreClassTwo
{
        private  int [] quantity;
    	private String[] list;
        private int numTitles;

 public  BookStoreClassTwo ( int size)
	{      numTitles = size;
           quantity = new int[size];
           list = new String [size];

        }

	public void getData( ) throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("inventory.txt"));
        String numTitlesString =input.readLine();
        numTitles = Integer.parseInt(numTitlesString);
        String quantityString;
    	for(int i = 0; i < numTitles; i++)
		{
			 list[i] = input.readLine();
             quantityString = input.readLine();
			 quantity[i] = Integer.parseInt(quantityString);
		}
	}

	public void displayInventory()
	 {
	   System.out.println( "The inventory is now");
	   System.out.println( " Title             Quantity");
	   for (int  i = 0; i <numTitles; i++)
	   	System.out.println(list[i] + "        \t " + quantity[i]);
	 }

	public void updateInventory() throws IOException
	{
		int subscript, quantitySold, numberTransactions;
		boolean found;
		String transaction;
		Scanner keyboard =new Scanner (System.in); 
		System.out.println("How many transactions do you have?");
	     numberTransactions = keyboard.nextInt(); 
	    String emptyString = keyboard.nextLine();  	
		for ( int i = 1; i <=numberTransactions; i++)
		{
		 System.out.println("Enter transaction");
		 transaction = keyboard.nextLine();
		 System.out.println("Enter amount");
		 
		 quantitySold = keyboard.nextInt(); 
		 

		 subscript = search(transaction);
		 if ( subscript >=0)
			quantity[subscript]= quantity[subscript] - quantitySold;
		 else
			System.out.println( transaction + "was never found");
		}
	}

	private int search(String key)
		{
		   boolean found;
		   int i;
	       found = false;
           i = 0;

		   while ( ! found && i < numTitles )
		   {
			if( list[i].equals(key))
				found = true;
			else
				  i++;
	  	}
	  	   if ( found == true)
	  		  return i;
           else
		  	return(-1);
		}

   public void sortByTitle()
   {  int i, j, minSubscript;
   
      System.out.println( "i  j  minSubscript");
	  
      for ( i = 0; i < numTitles -1; i++)
      {
	    minSubscript = j;
        for ( j = 0 ; j<=numTitles; j++)
        {
          if ( list[j].compareTo(list[minSubscript])<0)
                minSubscript = j;

          System.out.println( i + "  "  +  j + "  "  +  minSubscript);
          printList();
        }
        swap(i, minSubscript);
      }
   }
   
   public void swap( int first, int second)
   {


     list[first] = list[second];
     quantity[first] = quantity[second];

     list[second] = list[first];
     quantity[second] = quantityj[first];
   }

  public void printList ()
  { 
	System.out.print ( "list    " );
    for ( int i = 0; i < numTitles; i++)
      System.out.print ( i + "         " );
    System.out.println();
    System.out.print ("      " );
    for ( int i = 0 ; i < numTitles; i ++)
        System.out.print ( list[i] + "     ");
    System.out.println();
  }
}