package array;

public class ListClass {
	 private int [ ]  list;
	    private int count;

	    public int search ( int key)
	    { boolean found;
	        int i;
	        found = false;
	        i = 0;
	     while ( !found && i < count)
	    { 
	    	 if ( list[i]==(key))
	              found = true; 
	         else
	               i =i + 1;
	     }
	     if ( found == true)
	          return i;
	        else
	          return -1; 
	     }
	    }

