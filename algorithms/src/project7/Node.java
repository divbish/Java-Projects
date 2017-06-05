package project7;

public class Node<K, V, L>{ //This is not a node of a linked list.
	  private MyPair<K, V, L> element;
	  private int index;
	  
	  public Node(MyPair<K, V, L> element, int index){
	    this.index = index;
	    this.element = element;
	  }
	    
	  public MyPair<K, V, L> getElement(){return element;}
	  
	  public int getIndex(){return index;}
	  
	  public MyPair<K, V, L> setElement(MyPair<K, V, L> element){
	    MyPair<K, V, L> x = element;
	    this.element = element;
	    return x;
	  }
	  public void setIndex(int index){this.index = index;}
	}

