package project6;

import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    MyComparator comparator = new MyComparator();
    FastInsertionsPriorityQueue<Integer, Character> pq = new FastInsertionsPriorityQueue<Integer, Character>(comparator);
    Entry e;
    String s;
    pq.insert(5, 'A'); System.out.println(pq.toString());
    pq.insert(9, 'C'); System.out.println(pq.toString());
    pq.insert(3, 'B'); System.out.println(pq.toString());
    pq.insert(7, 'D'); System.out.println(pq.toString());
    e = pq.min();
    System.out.print("The minimum element is ");
    s = "(" + e.getKey() + ", " + e.getValue() + ")";
    System.out.println(s);
    e = pq.removeMin(); s = "(" + e.getKey() + ", " + e.getValue() + ")";
    System.out.print(s); System.out.println(pq.toString());
    e = pq.removeMin(); s = "(" + e.getKey() + ", " + e.getValue() + ")";
    System.out.print(s); System.out.println(pq.toString());
    e = pq.removeMin(); s = "(" + e.getKey() + ", " + e.getValue() + ")";
    System.out.print(s); System.out.println(pq.toString());
    e = pq.removeMin(); s = "(" + e.getKey() + ", " + e.getValue() + ")";
    System.out.print(s); System.out.println(pq.toString());
    System.out.println(pq.isEmpty());
  }
}

