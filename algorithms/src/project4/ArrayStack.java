package project4;

public class ArrayStack<E> implements Stack<E>{
	  public static final int DEFAULT_CAPACITY = 1000;
	  private int top;
	  private int capacity;
	  private E s[];

	  public ArrayStack(){
	    this(DEFAULT_CAPACITY);
	  }

	  public ArrayStack(int capacity){
	    this.capacity = capacity;
	    top = -1;
	    s = (E[]) new Object[capacity];
	  }

	  // Returns the number of elements in the stack
	  public int size(){
	    return top + 1;
	  }

	  // Returns true if stack is empty.
	  public boolean isEmpty(){
	    return top < 0;
	  }

	  // Returns true if stack is full.
	  public boolean isFull(){
	    return top == capacity - 1;
	  }

	  // Inserts item at the top of the stack.
	  public void push(E item) throws StackException{
	    if(isFull())
	      throw new StackException("Stack is full");
	    s[++top] = item;
	  }

	  // Returns the top item from top of the stack. But does not remove it.
	    public E top() throws StackException{
	    if(isEmpty())
	      throw new StackException("Stack is empty.");
	    E item = s[top];
	    return item;
	    }
	  
	  // Pops the top an item from top of the stack and returns it.
	  public E pop()throws StackException{
	    if(isEmpty())
	      throw new StackException("Stack is empty.");
	    E item = s[top--];
	    return item;
	  }
	  
	  //To use to display the content of the stack.
	  public String toString(){
	    String str = "[";
	    if(size()>0) str += s[0];
	    for(int i = 1; i <= top; i++)
	      str += ", " + s[i]; 
	    return str + "]";
	  }
	}