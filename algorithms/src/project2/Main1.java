package project2;

import java.util.*;

public class Main1{
  public static void main(String[] args){
  //DO NOT CHANGE THIS METHOD
  Random r = new Random(System.currentTimeMillis());
  int n = r.nextInt(101) + 50;
  int[] s = new int[n];
  for(int i = 0; i < n; i++)
    s[i] = r.nextInt(100);
  int[] v = removeDuplicates(s);
  Arrays.sort(v);
  System.out.println(Arrays.toString(v));
  }
  
  private static int[] removeDuplicates(int[] s){
    int[] result = new int[s.length];
		int count=0;
		for(int i=0; i < s.length; i++){
			if (s[i] != -1){
				for(int j=i+1; j < s.length; j++){
					if (s[j] == s[i]){
						s[j] = -1;
						count++;
					}
				}
			}
		}
		result = new int[s.length-count];
		count=0;
		for(int i=0; i<s.length; i++){
			if (s[i] != -1){
				result[count] = s[i];
				count++;
			}
		}
		return result;
	}  }
