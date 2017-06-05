package labTenPackage;


import java.io.*;
import java.util.Scanner;
public class BookStoreClass
{
        private  int [] quantity;
    	private String[] list;
    	private int[] sold;
        private int numTitles;

 public  BookStoreClass ( int size)
	{     numTitles = size;
           quantity = new int[size];
           list = new String [size];
           sold = new int[size];
           for(int i=0; i< size; i++){
        	   sold[i]=0;
           }
        }

	public void getData() throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/LabTen/inventory.txt"));
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
	   System.out.println( "Title\t\t\tQuantity\tSold");
	   for (int  i = 0; i <numTitles; i++)
	   	System.out.println(list[i] + "\t\t\t " + quantity[i] + "\t\t" + sold[i]);
	 }


	public void updateInventory() throws IOException
	{
		int subscript, quantitySold, numberTransactions;
		boolean found;
		String transaction, quantitySoldString;
		Scanner keyboard = new Scanner (System.in );  
		System.out.println("How many transactions do you have?");
		numberTransactions =  keyboard.nextInt();
		String emptyString = keyboard.nextLine ();  
		for ( int i = 1; i <=numberTransactions; i++)
		{
		 System.out.println("Enter transaction");
		 transaction = keyboard.nextLine();

		 System.out.println("Enter the quantity sold");
		 quantitySold = keyboard.nextInt();
		 emptyString = keyboard.nextLine ( );  

		 subscript = search(transaction);
		 if ( subscript >=0){
			quantity[subscript]= quantity[subscript] - quantitySold;
			sold[subscript] = sold[subscript] + quantitySold;
		 }
		 else
			System.out.println( transaction + "was never found");
		}
	}

	private int search(String key)
		{
		   boolean found;
		   int i;
		   i=0;
		   found=false;
		  while (!found && i<numTitles)
		  {
			  if(list[i].equals(key))
				found = true;
			  else
				  i++;
	  	}
	  	if (found == true)
	  		  return i;
              else
		  	return(-1);
		}
	public void deleteZero(){
		int i=0;
		while(i<numTitles){
			if(quantity[i]==0){
				for(int k=i; k<numTitles-1; k++){
					quantity[k]=quantity[k+1];
					list[k]=list[k+1];
					sold[k]=sold[k+1];
				}
				numTitles = numTitles - 1;
			}
			else
				i++;
		}
	}

}
