package mix;

import project4.QueueException;

public interface Queue<E>{
	  // Returns the number of elements in the queue
	  public int size();

	  // Returns true if queue is empty.
	  public boolean isEmpty();

	  //Returns the front item from the queue.
	  //But does not remove it.
	  public E front() throws QueueException;

	  // Inserts item at the rear of the queue.
	  public void enqueue(E item) throws QueueException;

	  // Removes an item from the rear the queue and returns it.
	  public E dequeue() throws QueueException;

	  // Returns true if the queue is full.
	  public boolean isFull();
	}