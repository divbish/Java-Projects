package labFourPackage;

import java.util.Scanner;

public class Test {

	
		public static void main(String[] args) {
			Scanner keyboard = new Scanner (System.in);
			int i=0,sum1=0,sum2=0;
		
			for(i=0;i<9;i++)
			{
				System.out.println("enter scores for team A of inning "+ (i+1));
				sum1 = sum1 + keyboard.nextInt();
				System.out.println("enter scores for team B of inning "+ (i+1));
				sum2 = sum2 + keyboard.nextInt();
			}
			
			System.out.println("total score of team A is" + sum1 +  "\ntotal score of team B is" + sum2);
		}


		 
	}


