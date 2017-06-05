package project3;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		/*
      Do not change this method other than un-commenting the lines marked I and II 
      one at the time. That is: Uncomment I and run the program. Then Comment I and 
      Uncomment II and run the program.
		 */
		Set a = new Set(), b = new Set(), c=new Set();
		a.makeSet();
		print(a);
		b.makeSet();
		print(b);
		c = (Set) a.union(b);
		print(c);//I
		c = (Set) a.intersection(b);			//II
		print(c);
		System.out.println(a.subset(b));
		System.out.println(b.subset(a));
		System.out.print("Enter an integer: ");
		int m = new java.util.Scanner(System.in).nextInt();
		System.out.println(a.member(m));
	}

	private static void print(Set x){
		//This method is complete.
		int i;
		for(i = 0; i < x.size()-1; i++)
			System.out.print(x.elementAt(i) + ", ");
		System.out.println(x.elementAt(i));		
	}
}
