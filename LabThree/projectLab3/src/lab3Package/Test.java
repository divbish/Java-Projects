package lab3Package;

import java.util.Scanner;

public class Test {

	public static void main ( String [] args)  
    {   double salary, femaleSum, maleSum, femaleAverage, maleAverage; 
        int i, femaleCount, maleCount; 
        String sex;
        Scanner keyboard = new Scanner (System.in);
        femaleSum = 0;  maleSum = 0;
        femaleCount = 0; maleCount = 0;
      for ( i=1;i<=500;i++)
           {  
               System.out.println ( "Enter male or female" );
               sex = keyboard.nextLine( );
               System.out.println ( "Enter salary" );
               salary=keyboard.nextDouble();
               if ( sex.equals ( "female" ))
                {  femaleCount=femaleCount+1; 
                  femaleSum = femaleSum + salary; 
                 }
             else if ( sex.equals( "male"))
                 { maleCount = maleCount + 1;
                 maleSum=maleSum + salary;
                   }
             else  System.out.println ( " incorrect code" );
        }
      femaleAverage = femaleSum/femaleCount;
        maleAverage = maleSum/maleCount;
        System.out.println ( "For " + femaleCount  +  "females, the average salary is " +femaleAverage);
        System.out.println ( "For " + maleCount  +  "males, the average salary is " +maleAverage);

}

}
