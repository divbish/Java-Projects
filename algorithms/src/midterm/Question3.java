package midterm;

import java.util.Arrays;
import java.util.Random;
import mix.*;


public class Question3 {

	// This method is complete. Do not change it.
	public static void main(String[] args){
	    Random r = new Random();
	    r.setSeed(System.currentTimeMillis());
	    int n = r.nextInt(20) + 1;
	    System.out.println("size is "+n);
	    List[]a = new ArrayList[n];
	    makeLists(a);
	    for(int i = 0; i < a.length; i++)
	    	System.out.println(a[i].toString());
	  }

	private static void makeLists(List[] a) {
		for(int i=0; i<a.length; i++){
			List temp = new ArrayList(i+1);
			for(int j=0; j<i+1; j++){
				temp.add(j+1, (char)('A'+j));
			}
			a[i]=temp;
		}
	}
}