package labFourPackage;
import java.util.Scanner;
public class TuitionClass
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);
    String name,emptyString;
    int fee,  hours;
    String code;


    int i;

   for ( i = 1; i <=3; i++)
    {
	System.out.println( "Enter your last name ");
	name = keyboard.nextLine();
	System.out.println( "Enter your four digit pin number");
	pinNumber = keyboard.nextInt();
	emptyString = keyboard.nextLine();
	System.out.println("Enter code - UnderGradCommuter  - UnderGradResident - GradCommuter - GradResident");
	code = keyboard.nextLine ();
    ____________________________________________________
	hours = keyboard.nextInt();
    emptyString = _____________

	if ( code.equals("UnderGradCommuter") )
	    {
		fee = 500 ( hours);
		feeOne = feeOne + fee;
	     }
	else if ( code.equals("UnderGradResident")
            {
		fee = 550 * hours;
		feeTwo = feeTwo + fee;
	    }
       else if ( code.equals(_________________) )
	   {
		fee = 650  * hours;
		feeThree = feeThree + fee;
	   }
	else if ( code == "GradResident") )
          {
		fee = 700 * hours;
	        feeFour = feeFour + fee;
	  }
	else
	        fee = 0;


       	System.out.println( "The fee for student" + name + " is " + fee);
    }

	System.out.println( "The total fee for code UnderGraduate Commuting is " + feeOne);
	System.out.println( "The total fee for code UnderGraduate Resident is " + feeTwo);
    System.out.println( "The total fee for code Graduate Commuting is " + feeThree);
    System.out.println( "The total fee for code Graduate Resident is " + feeFour);
  }

}