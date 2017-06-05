package project1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Project1 {
  public static void main(String[] args) {
    char[] original = new char[]{'A', 'B', 'C', 'D', 'E'};
    Character[] encrypted = new Character[]{'A', 'B', 'C', 'D', 'E'};

    Collections.shuffle(Arrays.asList(encrypted));
    String s = new String(original);
    String t = String.valueOf(s);
    System.out.println(s);
    System.out.println(t);
  }
}

