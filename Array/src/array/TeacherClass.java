//package array;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//public class TeacherClass {
//	 private String [ ] teachers; 
//	  private int count = 1000;
//
//	  public void readInput () throws IOException
//	   {
//	     BufferedReader input = new BufferedReader ( new FileReader ( "names.dta" )):
//	     teachers  = new String [ count ];
//
//	     for ( int i = 1; i < count; i ++ )
//	     {
//	        teachers[i ]= input.read ();
//	     }
//
//	  public void printList  (   )
//	     {
//	        for ( i = 0; i < count; i ++ )
//	             System.out.println(teachers[i]);
//	     }
//
//	  public boolean search ( String key )
//	      {   boolean found = false;
//	          int i = 0;  
//	          while ( !found && i< count)__________________________________  (2)
//	            {
//	              if (teacher[i].equals(key))__________________________________________ ( 3)
//	                   found = true;________________________(4)
//	              else
//	                  i = i + 1; 
//	           }
//	          return found;
//	      }
//	   }
