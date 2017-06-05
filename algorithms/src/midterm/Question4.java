package midterm;

import java.util.Random;

import project4.QueueException;
import mix.*;

public class Question4<E> {
	Queue<E> q;

	public Question4() {
		q = new ArrayQueue<E>();
	}

	public void add(int index, E item) throws QueueException {
		Queue<E> temp = new ArrayQueue<E>();
		for(int i=0; i<index;i++){ 
			temp.enqueue(q.dequeue());
		}
		temp.enqueue(item);
		while(!q.isEmpty()){
			temp.enqueue(q.dequeue());
		}
		while(!temp.isEmpty()){
			q.enqueue(temp.dequeue());
		}
	}

	public String toString() {
		return q.toString();
	}
	
	public static void main(String[] args) throws QueueException{
		Question4 obj = new Question4();
		Random r = new Random();
	    r.setSeed(System.currentTimeMillis());
	    int n = r.nextInt(20) + 1;
	    System.out.println("size is "+n);
	    for(int i = 0; i < n; i++)
	    	obj.q.enqueue(i);
	    System.out.println(obj.toString());
	    obj.add(2, 500);
	    System.out.println(obj.toString());
	}
}
