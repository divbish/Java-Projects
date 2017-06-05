package array;

import java.util.Scanner;

public class Array {
	 public static void main(String[] args){
//	 double last =0;
//     double [] value = new double [20];
//     Scanner keyboard = new Scanner (System.in );
//     System.out.println ( "Enter 20 values " );
// 
//     for ( int i = 0; i < 20; i ++ ) {
//    	 value [ i ] = keyboard.nextDouble ();
//     }
//      last = value[value.length-1];
//      System.out.println("The last number read is " + last );
//      for ( int i = 0; i < 20; i ++ ) {
//           System.out.println(value[i] +
//        		   " differs from the last number by " +
//        		   (value[i] - last));
		final int size = 100;
		int [ ] count = new  int [ size];
		 
		for (int i=0;i< 100; i++){
			count[i] = 0;
		}
		
     Scanner keyboard = new Scanner (System.in );
     System.out.println ( "Enter 100 values " );
     for (int i=0;i< 100; i++){
			count[i] = keyboard.nextInt();
		}
     
     int sum=0;
     for (int i=0;i< 100; i++){
			 sum = sum + count[i];
		}

	 }
	
}