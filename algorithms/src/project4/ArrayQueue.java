package project4;

public class ArrayQueue<E> implements Queue<E>{
	public static final int DEFAULT_CAPACITY = 1000;
	private int capacity;
	private ArrayStack s;

	public ArrayQueue(){
		this(DEFAULT_CAPACITY);
	}

	public ArrayQueue(int capacity){
		s = new ArrayStack(capacity);
		this.capacity = capacity;
	}

	// Returns the number of elements in the queue
	public int size(){
		return s.size();
	}

	// Returns true if queue is empty.
	public boolean isEmpty(){
		return s.isEmpty();
	}

	// Returns true if queue is full.
	public boolean isFull(){
		return s.isFull();
	}

	//Returns the front item from the queue.
	//But does not remove it.
	public E front() throws QueueException, StackException{
		if(isEmpty())
			throw new QueueException("Queue is empty");
		ArrayStack tempStack = new ArrayStack(this.capacity);
		int t = s.size();
		for(int i=0; i< t; i++)
			tempStack.push(s.pop());
		E item = (E)tempStack.top();
		for(int i=0; i< t; i++)
			s.push(tempStack.pop());
		return item;
	}

	// Inserts item at the rear of the queue.
	public void enqueue(E item)throws QueueException{
		try {
			s.push(item);
		} catch (StackException e) {
			throw new QueueException("Queue is full");
		}
	}

	public E dequeue()throws QueueException, StackException{
		if(isEmpty())
			throw new QueueException("Queue is empty");
		ArrayStack tempStack = new ArrayStack(this.capacity);
		int t=s.size();
		for(int i=0; i< t; i++)
			tempStack.push(s.pop());
		E item = (E)tempStack.pop();
		for(int i=0; i< t-1; i++)
			s.push(tempStack.pop());
		return item;
	}

	//To use to display the content of the queue.
	public String toString(){
		return s.toString();
	}
}
