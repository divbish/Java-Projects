package project5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random(System.currentTimeMillis());
		int n = r.nextInt(20)+1;
		int min=0;
		Position<Integer> p;
		PositionalList<Integer> a = new LinkedPositionalList<Integer>();
		System.out.println("The number of integers in the Positional array are "+ n);
		for(int i=0; i <n; i++){
		    a.addLast(r.nextInt(100)+1);
		}
		System.out.println(a.toString());
		if (!a.isEmpty()){
			p=a.first();
			min =(int) p.getElement();
			for(int i=1; i<a.size(); i++){
				p=a.after(p);
				if (min > (int)(p.getElement())){
					min = (int)(p.getElement());
				}
			}
			System.out.println("The minimum number in the Positional Linked List is "+min);
		}
		else
			System.out.println("Empty List");

	}

}
