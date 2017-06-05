package midterm;

import java.util.Stack;

import project4.ArrayStack;
import project4.StackException;

public class Question2<E> {
	private ArrayStack<E> stack;
	private int size;

	public Question2(int size) throws StackException {
		this.size = size;
		stack = new ArrayStack<E>(this.size);
		// In a stack all the consecutive locations from its bottom to its top
		// should have
		// values. In an array this is not true. We may assign or access to any
		// index of
		// the array no matter whether or not all other locations have values.
		// Therefore
		// we should start from a full stack of null values. This means we have
		// an array
		// that all of its elements are initialized by null value.

		for (int i = 0; i < size; i++)
			stack.push(null);
	}

	public int size() {
		return size;
	}

	public E get(int index) throws ArrayOutOfBoundException, StackException {
		ArrayStack<E> stack1 = new ArrayStack<E>(this.size());
		int i;
		E item = null;
		for(i=0; i<this.size() && i<= index; i++){
			stack1.push(stack.pop());
		}
		if (i<this.size()){
			item = stack1.top();
			for(i=0; i<this.size() && i<= index; i++){
				stack.push(stack1.pop());
			}
		}
		
		return item;
	}

	public void set(int index, E item) throws StackException,
			ArrayOutOfBoundException {
		ArrayStack<E> stack1 = new ArrayStack<E>(this.size());
		int i;
		for(i=0; i<this.size() && i<= index; i++){
			stack1.push(stack.pop());
		}
		if (i<=this.size()){
			stack1.pop();
			stack1.push(item);
			for(i=0; i<this.size() && i<= index; i++){
				stack.push(stack1.pop());
			}
		}
	}
	
	public static void main(String[] args) throws StackException, ArrayOutOfBoundException {
		Question2 obj = new Question2(10);
		obj.set(4, 100);
		for(int i=0;i<10;i++)
			obj.set(i, i);
		System.out.println(obj.stack.toString());
//		System.out.println(obj.get(0));
//		System.out.println(obj.toString());
		obj.set(4, 100);
		System.out.println(obj.stack.toString());
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
//		System.out.println(obj.toString());
		System.out.println(obj.get(3));
//		System.out.println(obj.toString());
		System.out.println(obj.get(4));
//		System.out.println(obj.toString());
//		System.out.println(obj.get(5));
//		System.out.println(obj.toString());
		
	}
}

class ArrayOutOfBoundException extends Exception {
	/**
			 * 
			 */
	private static final long serialVersionUID = 1L;

	public ArrayOutOfBoundException(String s) {
		super(s);
	}
}
