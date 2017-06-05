package project7;

public interface List<E> {
	// Returns the number of elements.
	public int size();

	// Returns whether the list is empty.
	public boolean isEmpty();

	// Inserts an element e to be at position i, shifting all elements after
	// this.
	public void add(int i, E e);

	// Returns the element at position i, without removing it.
	public E get(int i);

	// Removes and returns the element at position i, shifting the elements
	// after this.
	public E remove(int i);

	// Replaces the element at position i with e, returning the previous element
	// at i.
	public E set(int i, E e);
}
