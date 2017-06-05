package project4;

public interface Stack <E>{
	  // Returns the number of elements in the stack
	  public int size();

	  // Returns true if stack is empty.
	  public boolean isEmpty();

	  //Returns the top item from top of the stack.
	  //But does not remove it.
	  public E top() throws StackException;

	  // Inserts item at the top of the stack.
	  public void push(E item) throws StackException;

	  // Pops the top an item from top of the stack and returns it.
	  public E pop() throws StackException;

	  // Returns true if stack is full.
	  public boolean isFull();
	}

