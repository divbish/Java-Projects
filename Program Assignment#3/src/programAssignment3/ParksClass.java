package programAssignment3;

import java.util.Scanner;

public class ParksClass {
	
	private double swimmingFeeTotal;
    private double tennisFeeTotal;
    private double racquetballFeeTotal;
    private double aerobicsFeeTotal;
    private double swimmingMemberTotal;
    private double tennisMemberTotal;
    private double racquetballMemberTotal;
    private double aerobicsMemberTotal;
    private String sport;
    private int familyMembers;
    private String familyName;
    private double fee;
    
    public void ParkClass ()
    {
    	swimmingFeeTotal=0;
    	tennisFeeTotal=0;
    	racquetballFeeTotal=0;
    	aerobicsFeeTotal=0;
    	swimmingMemberTotal=0;
    	tennisMemberTotal=0;
    	racquetballMemberTotal=0;
    	aerobicsMemberTotal=0;
	}
    public void getFamilyInfo()
    {
    	System.out.println("Enter your family name");
    	Scanner keyboard = new Scanner (System.in);
    	familyName = keyboard.next();
    	System.out.println("Enter your family Members");
    	familyMembers = keyboard.nextInt();
    	System.out.println("Enter your sport");
    	sport = keyboard.next();
    }
    public void figureFamilyFeeAndAccumulate () 
    {
    	if (sport.equals("swimming")){
    		fee=familyMembers * 45;
    		swimmingFeeTotal= swimmingFeeTotal + fee;
    		swimmingMemberTotal = swimmingMemberTotal + familyMembers;
    		}
    	else if (sport.equals("tennis")){
    		fee=familyMembers * 60;
    		tennisFeeTotal= tennisFeeTotal + fee;
    		tennisMemberTotal = tennisMemberTotal + familyMembers;
    	}
    	else if (sport.equals("racquetball")){
    		fee=familyMembers * 50;
    		racquetballFeeTotal= racquetballFeeTotal + fee;
    		racquetballMemberTotal = racquetballMemberTotal + familyMembers;
    	}
    	else if (sport.equals("aerobics")){
    		fee=familyMembers * 35;
    		aerobicsFeeTotal = aerobicsFeeTotal + fee;
    		aerobicsMemberTotal = aerobicsMemberTotal + familyMembers;
    	}
    }
    public void printFamilyInfo( )
    {
    	System.out.println("Welcome " + familyName + " family");
    	System.out.println("You registered for " + sport);
    	System.out.println("Total fee is " + fee);
    }
    public void printAllTotals( )
    {
    	System.out.println("Total members registered for swimming are "+ swimmingMemberTotal + " and the total fee for swimming is " +swimmingFeeTotal);
    	System.out.println("Total members registered for aerobics are "+ aerobicsMemberTotal + " and the total fee for aerobics is " +aerobicsFeeTotal);
    	System.out.println("Total members registered for racquetball are "+ racquetballMemberTotal + " and the total fee for racquetball is " +racquetballFeeTotal);
    	System.out.println("Total members registered for tennis are "+ tennisMemberTotal + " and the total fee for tennis is " +tennisFeeTotal);
    	System.out.println("Total winter program money collection is " + (swimmingFeeTotal + tennisFeeTotal + racquetballFeeTotal + aerobicsFeeTotal));
    	System.out.println("Total people registered in the winter program are "+(swimmingMemberTotal+aerobicsMemberTotal+racquetballMemberTotal+tennisMemberTotal));
    }

}
