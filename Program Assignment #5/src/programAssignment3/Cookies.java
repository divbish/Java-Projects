package programAssignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cookies {
	private String [] teacherName;
	private int [] soldBoxes;
	private int count;
	
	public Cookies(){
		teacherName = new String [25];
		soldBoxes = new int [25];
	}
	public void readInput() throws IOException
	{
		BufferedReader input = new BufferedReader (new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/Program Assignment/cookies.txt"));
	    count = Integer.parseInt(input.readLine());
	    System.out.println("Total number of students is " + count);
		for ( int i = 0; i < count ; i++) 
		{  
			teacherName [i] = input.readLine();
			soldBoxes [i] = Integer.parseInt(input.readLine());
		}
	}
	public void updateData() throws IOException
	{
		BufferedReader input = new BufferedReader(new FileReader("/Users/divyabishnoi/Documents/Eclipse2015/Program Assignment/update.txt"));
		int found=0;
		String name = input.readLine();
		while(name!=null){
			if (name!=null){
				found = search(name);
			}
			if(found!=-1){
				soldBoxes[found] = soldBoxes[found] + Integer.parseInt(input.readLine());
			}
			name = input.readLine();
		}
	}
	public int search(String key){
		for(int i=0; i<count; i++){
			if (teacherName[i].equals(key)){
				return i;
			}
		}
		return -1;
	}
	public void displaySalesList ()
	{
		System.out.println( "The Sales list of Cookies is : ");
		for (int  i = 0; i < count; i++)
		{
		     System.out.println( teacherName [i] + "				"+ soldBoxes [i]);
	    }
	}
	public void winnerOfSales()
	{
		int max = 0;
		int maxIndex = 0;
		for (int  i = 0; i < count ; i++)
		{
			if (max < soldBoxes[i]){
				max = soldBoxes[i];
				maxIndex = i;
			}
		}
		System.out.println( "The maximum boxes sold is " + max);
		System.out.println( "The maximum boxes sold by " + teacherName[maxIndex] + " and his class is WINNER .");
		
	}
	
	public void sortByTeachersName(){  
		int i, j=0, minSubscript;
		for ( i = 0; i < count -1; i++)
		  {
		    minSubscript = i;
		    for ( j = i+1 ; j<count; j++)
		    {
		      if ( teacherName[j].compareTo(teacherName[minSubscript])<0)
		            minSubscript = j;
		    }
		    swap(i, minSubscript);
		  }
	   }
	   
	   public void sortByQuantity(){ 
		  int i, j=0, maxSubscript;
	      for ( i = 0; i < count -1; i++)
	      {
	    	  maxSubscript = i;
	        for ( j = i+1 ; j<count; j++)
	        {
	          if ( soldBoxes[j] > soldBoxes[maxSubscript])
	        	  maxSubscript = j;
	        }
	        swap(i, maxSubscript);
	      }
	   }
	   
	   public void swap( int first, int second)
	   {
		 int tempQuantity = soldBoxes[first];
		 String tempList = teacherName[first];
		 teacherName[first] = teacherName[second];
	     soldBoxes[first] = soldBoxes[second];

	     teacherName[second] = tempList;
	     soldBoxes[second] = tempQuantity;
	   }
}
