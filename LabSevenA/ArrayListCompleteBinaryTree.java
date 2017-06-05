package project7;

public class ArrayListCompleteBinaryTree<K, V, L>{
	  private ArrayList<Node<K, V, L>> t;
	  
	  public ArrayListCompleteBinaryTree(){
	    t = new ArrayList<Node<K, V, L>>();
	    t.add(0, null);  //Index 0 of the array is empty.
	  }

	  public int size(){return t.size() - 1;}
	  public boolean isEmpty(){return size() == 0;}
	  public boolean isInternal(Node<K, V, L> v)throws InvalidException{ return hasLeft(v);}
	  public boolean isExternal(Node<K, V, L> v)throws InvalidException{ return ! isInternal(v);}
	  public boolean isRoot(Node<K, V, L> v)throws InvalidException{ 
	    Node<K, V, L> vv = checkLocation(v);
	    return vv.getIndex() == 1;
	  }
	  public boolean hasLeft(Node<K, V, L> v)throws InvalidException{
	    Node<K, V, L> vv = checkLocation(v);
	    return 2*vv.getIndex() <= size();
	  }
	  
	  public boolean hasRight(Node<K, V, L> v)throws InvalidException{
	    Node<K, V, L> vv = checkLocation(v);
	    return 2*vv.getIndex() + 1<= size();
	  }
	  
	  public Node<K, V, L> root() throws InvalidException{
	    if(isEmpty()) throw new InvalidException("Tree is empty.");
	    return t.get(1);
	  }
	  
	  public Node<K, V, L> left(Node<K, V, L> v) throws InvalidException{
	    if(! hasLeft(v)) throw new InvalidException("Has no left.");
	    Node<K, V, L> vv = checkLocation(v);
	    int index = 2 * vv.getIndex();
	    return t.get(index);
	  }
	  
	  public Node<K, V, L> right(Node<K, V, L> v) throws InvalidException{
	    if(! hasRight(v)) throw new InvalidException("Has no right.");
	    Node<K, V, L> vv = checkLocation(v);
	    int index = 2 * vv.getIndex() + 1;
	    return t.get(index);
	  }
	  
	  public Node<K, V, L> parent(Node<K, V, L> v) throws InvalidException{
	    if(isRoot(v)) throw new InvalidException("Has no parent. It is root");
	    Node<K, V, L> vv = checkLocation(v);
	    return t.get(vv.getIndex()/2);
	  }
	  
	  public MyPair<K, V, L> replace(Node<K, V, L> v, MyPair<K, V, L> element) throws InvalidException{
	    Node<K, V, L> vv = checkLocation(v);
	    return vv.setElement(element);
	  }
	  
	  public Node<K, V, L> add(MyPair<K, V, L> e){
	    int i = size() + 1;
	    Node<K, V, L> p = new Node<K, V, L>(e, i);
	    t.add(i, p);
	    return p;
	  }
	  
	  public MyPair<K, V, L> remove()throws InvalidException{
	    if(isEmpty()) throw new InvalidException("The tree is empty.");
	    return t.remove(size()).getElement();
	  }
	  
	  private Node<K, V, L> checkLocation(Node<K, V, L> v) throws InvalidException{
	    if(v == null) throw new InvalidException("Not a valid location");
	    return v;
	  }
	  
	  public String toString(){
	    String pair;
	    String s = "{";
	    if(!t.isEmpty()&&t.get(1) != null){
	      pair = "(" + t.get(1).getElement().getValue() + ", " + t.get(1).getElement().getKey() + ", " + t.get(1).getElement().getLength() + ")";
	      s += pair;
	    }
	    for(int i = 2; i <= size(); i++){
	      pair = "(" + t.get(i).getElement().getValue() + ", " + t.get(1).getElement().getKey() + ", " + t.get(i).getElement().getLength() + ")";
	      s += pair;
	    }
	    return s + "}";
	  }
	}