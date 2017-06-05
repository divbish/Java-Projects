package project4;

public class Main {
	  public static void main(String[] args) throws StackException {
	    Queue<Integer> queue = new ArrayQueue<Integer>(4);
	    //Queue<Integer> queue = new LinkedQueue<Integer>();
	    //Queue<Integer> queue = new VectorQeue<Integer>();
	    try{
	      for(int i = 1; i <= 4; i++){
	        queue.enqueue(-i);
	        System.out.println(queue.toString());
	      }
	      System.out.println(queue.front());
	      System.out.println(queue.dequeue());
	      System.out.println(queue.toString());
	      System.out.println(queue.dequeue());
	      System.out.println(queue.toString());
	      queue.enqueue(-5);
	      System.out.println(queue.toString());
	      System.out.println(queue.dequeue());
	      System.out.println(queue.toString());
	      queue.enqueue(-6);
	      System.out.println(queue.toString());
	      System.out.println(queue.dequeue());
	      System.out.println(queue.toString());
	    }catch(QueueException e){
	      System.out.println(e);
	    }
	  }
	}

