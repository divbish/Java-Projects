

public class MyPair<K, V, L> {
	  private K key; 
	  private V value;
	  private L length;
	  public MyPair(K key, V value, L length){
	    this.key = key;
	    this.value = value;
	    this.length = length;
	  }
	  
	  public K getKey(){return key;}
	  public V getValue(){return value;}
	  public L getLength(){return length;}
	  
	  public void setKey(K key){this.key = key;}
	  public void setValue(V value){this.value = value;}
	  public void setLength(L length){this.length = length;}
	}

