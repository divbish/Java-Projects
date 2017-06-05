package project6;

import java.util.Comparator;

import project6.AbstractPriorityQueue.PQEntry;

public class FastInsertionsPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> { 
	//primary collection of priority queue entries       
	private PositionalList<Entry<K,V>> list = new LinkedPositionalList<>( );               

	//Creates an empty priority queue based on the natural ordering of its keys.       
	public FastInsertionsPriorityQueue( ) { super( ); }
	//Creates an empty priority queue using the given comparator to order keys.
	public FastInsertionsPriorityQueue(Comparator<K> comp) { super(comp); }

	//Inserts a key-value pair and returns the entry created.           
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key); // auxiliary key-checking method (could throw exception) 
		Entry<K,V> newest = new PQEntry<>(key, value);
		if(list.isEmpty())
			list.addFirst(newest);
		else	
			list.addAfter(list.last(), newest);           
		return newest;                    
	} 

	//Returns (but does not remove) an entry with minimal key.          
	public Entry<K,V> min( ) {
		if (list.isEmpty( )) return null;
		Position<Entry<K,V>> minNode = list.last();
		Position<Entry<K,V>> currentNode = list.last();
		  // walk backward, looking for smaller key  
		while(currentNode!=null){
			if (compare(minNode.getElement(), currentNode.getElement())>0)
				minNode=currentNode;
			currentNode = list.before(currentNode);
		}          
		return minNode.getElement();                  
	}

	//Removes and returns an entry with minimal key.            
	public Entry<K,V> removeMin() {
		if (list.isEmpty( )) return null;
		Position<Entry<K,V>> minNode = list.last();
		Position<Entry<K,V>> currentNode = list.last();
		  // walk backward, looking for smaller key  
		while(currentNode!=null){
			if (compare(minNode.getElement(), currentNode.getElement())>0)
				minNode=currentNode;
			currentNode = list.before(currentNode);
		}
		return list.remove(minNode);                  
	}

	//Returns the number of items in the priority queue.           
	public int size( ) { return list.size( ); }

	public String toString(){
		String s = "[";
		if(!list.isEmpty()) 
			s += "(" + list.first().getElement().getKey() + ", " + list.first().getElement().getValue() + ")";
		Position<Entry<K, V>> p = list.first();
		while (p != list.last()){
			p = list.after(p);
			s += "(" + p.getElement().getKey()  + ", " + p.getElement().getValue() + ")";
		}
		return s + "]";
	}
}