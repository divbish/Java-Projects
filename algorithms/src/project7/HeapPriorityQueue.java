package project7;

import java.security.InvalidKeyException;
import java.util.Comparator;

public class HeapPriorityQueue<K,V, L> {;//implements PriorityQueue<K,V> {
  private ArrayListCompleteBinaryTree<K, V, L> heap;	// underlying heap
  private Comparator<K> comp;	// comparator for the keys
  //Creates an empty heap with the default comparator 
  public HeapPriorityQueue() {  
    heap = new ArrayListCompleteBinaryTree<K, V, L>(); // use an array list
    comp = new MyComparator<K>();     // use the default comparator
  }
  //Creates an empty heap with the given comparator
  public HeapPriorityQueue(Comparator<K> c) {
    heap =  new ArrayListCompleteBinaryTree<K, V, L>();
    comp = c;
  }

  public void setComparator(Comparator<K> c) throws IllegalStateException {
    if(!isEmpty())  // this only allowed if the priority queue is empty
      throw new IllegalStateException("Priority queue is not empty");
    comp = c;
  }

  public int size() { return heap.size(); } 
  //Returns whether the heap is empty
  public boolean isEmpty() { return heap.size() == 0; }

  public MyPair min() throws PriorityQueueException, InvalidException {
    if (isEmpty()) 
      throw new PriorityQueueException("Priority queue is empty");
    return heap.root().getElement();
  }
  
  //Inserts a node with key-value pair.
  public void insert(K k, V x, L l) throws InvalidKeyException, InvalidException {
    checkKey(k);  // may throw an InvalidKeyException
    MyPair<K, V, L> entry = new MyPair<K, V, L>(k, x, l);
    upHeap(heap.add(entry));
  }
  //Removes and returns an entry with minimum key
  public MyPair<K, V, L> removeMin() throws PriorityQueueException, InvalidException {
    if (isEmpty()) 
      throw new PriorityQueueException("Priority queue is empty");
    MyPair<K, V, L> min = heap.root().getElement();
    if (size() == 1)
      heap.remove();
    else {
      heap.replace(heap.root(), heap.remove());
      downHeap(heap.root());
    }
    return min;
  }
  //Determines whether a given key is valid
  private void checkKey(K key) throws InvalidKeyException {
    try {
      comp.compare(key,key);
    }
    catch(Exception e) {
      throw new InvalidKeyException("Invalid key");
    }
  }

  private void upHeap(Node<K, V, L> v) throws InvalidException {
    Node<K, V, L> u;
    while (!heap.isRoot(v)) {
      u = heap.parent(v);
      if (comp.compare(u.getElement().getKey(), v.getElement().getKey()) <= 0) break;
      swap(u, v);
      v = u;
    }
  }
  //Performs down-heap bubbling
  private void downHeap(Node<K,V, L> r) throws InvalidException {
    while (heap.isInternal(r)) {
      Node<K, V, L> s;		// the position of the smaller child
      if (!heap.hasRight(r))
    	  s = heap.left(r);
      else 
        if (comp.compare(heap.left(r).getElement().getKey(),
            heap.right(r).getElement().getKey()) <=0
           )
    	  s = heap.left(r);
      else
    	  s = heap.right(r);
      if (comp.compare(s.getElement().getKey(), r.getElement().getKey()) < 0) {
	swap(r, s);
	r = s;
      }
      else 
	break;
    }
  }
  //Swaps the pairs of the two given nodes
  private void swap(Node<K, V, L> x, Node<K, V, L> y) throws InvalidException {
	MyPair<K, V, L> temp = x.getElement();
    heap.replace(x, y.getElement());
    heap.replace(y, temp);
  }
  
  //Text visualization for debugging purposes
  public String toString() {
    return heap.toString();
  }
}

