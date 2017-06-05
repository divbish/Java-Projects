

mport java.io.*;
public class BookStoreClass
{
        private  int [] quantity;
    	private String[] list;
        private int numTitles;

 public  BookStoreClass ( int size)
	{     numTitles = size;
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

	/*public void updateInventory() throws IOException
	{
		int subscript, quantitySold, numberTransactions;
		boolean found;
		String transaction, quantitySoldString;
		Scanner keyboard = new Scanner (System.in );  
		System.out.println("How many transactions do you have?");
		numberTransactions =  ______________________;
		String emptyString = keyboard.nextLine ( );  
		for ( int i = 1; i <=numberTransactions; i++)
		{
		 System.out.println("Enter transaction");
		 _________________________________________

		 System.out.println("Enter the quantity sold");
		 __________________________________________
		 emptyString = keyboard.nextLine ( );  

		 subscript = search( ___________________);
		 if ( subscript >=0)
			quantity[subscript]= ____________________________________
		 else
			System.out.println( transaction + "was never found");
		}
	}

	private int search(String key)
		{
		   boolean found;
		   int i;
	           ________________________
                  _________________________

		  while ( _______________________ )
		  {
			  if( ______________________  )
				found = true;
			  else
				  i++;
	  	}
	  	if ( found == true)
	  		  return ____;
              else
		  	return(____);
		}


          */
