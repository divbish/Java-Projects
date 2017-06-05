package project6;

public class MyEntry<K, V> implements Entry<K, V>{
    private K key;
    private V value;
    
    public MyEntry(K key, V value){
      this.key = key;
      this.value = value;
    }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public String toString(){
    return "("+ key + ", " + value + ")";
  }
}

