

import java.util.Comparator;

public class MyComparator<K> implements Comparator<K> {
  // Compares two integers.
  public int compare(K a, K b) {
    return (Integer)a - (Integer)b;
  }
}
