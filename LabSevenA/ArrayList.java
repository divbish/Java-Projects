package project7;

public class ArrayList<E> implements List<E> {
	private E[] a; // array storing the elements of the list
	private int capacity = 16;// 16; // initial length of array A
	private int size = 0; // number of elements stored in the list

	// Creates the list with initial capacity 16.
	public ArrayList() {
		a = (E[]) new Object[capacity]; // the compiler may warn, but this is ok
	}

	// Returns the number of elements.
	public int size() {
		return size;
	}

	// Returns whether the list is empty.
	public boolean isEmpty() {
		return size() == 0;
	}

	// Inserts an element e to be at position r, shifting all elements after
	// this.
	public void add(int r, E e) {
		int index;
		if (this.isEmpty())
			index=r;
		else
			index = --r;
				
			checkIndex(index, true); // Add can add after the last element which its
									// is index is size.
		if (size == capacity) { // an overflow. Double the size.
			capacity *= 2;
			E[] b = (E[]) new Object[capacity];
			for (int i = 0; i < size; i++)
				b[i] = a[i];
			a = b;
		}
		for (int i = size - 1; i >= index; i--)
			// shift elements up
			a[i + 1] = a[i];
		a[index] = e;
		size++;
	}

	// Returns the element at position r, without removing it.
	public E get(int r) {
		int index = --r;
		checkIndex(index, false);
		return a[index];
	}

	public E remove(int r) {
		int index = --r;
		checkIndex(index, false);
		E temp = a[index];
		for (int i = index; i < size - 1; i++)
			// shift elements down
			a[i] = a[i + 1];
		size--;
		return temp;
	}

	// Replaces the element at position i with e, returning the previous element
	// at r.
	public E set(int r, E e) {
		int index = --r;
		if (index>0)
			checkIndex(index, false);
		E temp = a[index];
		a[index] = e;
		return temp;
	}

	// Checks whether the given index is in the range [0, n - 1]
	protected void checkIndex(int index, boolean isAdd) {
		// We can add in the first empty location (its index is the same as
		// size)
		if (isAdd && index >= 0 && index <= size)
			return;
		// It is for get, remove, or set. Therefore the lement must be avilable
		// (index must
		// be less than size)
		if (index >= 0 && index < size)
			return;
		try {
			throw new IndexOutOfBoundsException("Illegal position: "
					+ (index + 1));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public String toString() {
		String s = "(";
		if (size > 0)
			s += a[0];
		for (int i = 1; i < size; i++)
			s += ", " + a[i];
		return s + ")";
	}
}
