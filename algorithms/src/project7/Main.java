package project7;

import java.util.Random;

public class Main {
	  public static void main(String[] args) throws PriorityQueueException, java.security.InvalidKeyException {
	    HeapPriorityQueue<Integer,Character, Integer> t = new HeapPriorityQueue<Integer,Character, Integer>();
	    Random r = new Random(System.currentTimeMillis());
	    MyPair<Integer, Character, Integer> n;
	    try {for(int i=0;i<5;i++){
	    	t.insert(r.nextInt(40)-20 , (char)(r.nextInt(25)+65), r.nextInt(5)+1);
	    }
	    	System.out.println(t.toString());
	      while(!t.isEmpty()){
	    	  n = t.removeMin();
	    	  System.out.println("The job being executed is " + n.getValue() + " with priority = " + n.getKey() + " and length = " + n.getLength() + ")");
	    	  int newPriority = n.getKey() ;
	    	  if (n.getKey() < 20){
    			  newPriority+=1;
    		  }
	    	  if (n.getLength() > 1){
	    		  System.out.println("Add Job " + n.getValue()  + " with priority = " + newPriority+ " and length =" + (n.getLength()-1));
	    		  t.insert(n.getKey()+1 , n.getValue(), n.getLength()-1);
	    	  }
	    	  else
	    		  System.out.println("no new job this slice");
	    	  System.out.println(t.toString());
	      }
	    } catch (InvalidException e) {
	      e.printStackTrace();
	    }
	  }
	}

