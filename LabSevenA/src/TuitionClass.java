import java.util.Scanner;


public class TuitionClass {
	private String name;
	   private double tuition;
	   private double rebate;

	   public TuitionClass ()
	   {  }
	  
	  
	public  void getTuition ()
	      {
	           Scanner keyboard = new Scanner (System.in );  
	           System.out.println ("Enter your name " );
	           name = keyboard.nextLine ( );                          
	           System.out.println ( "Enter tuition" );
	           tuition = keyboard.nextDouble();//(2)_________________________________  
	        }

	public void figureRebate (  )
	{
	    if ( tuition <= 600)
	       rebate = 0.70 * tuition;

	    else if ( tuition>600 && tuition <= 900)  //(3)
	        rebate = 0.70 * 600 + .50 * ( tuition - 600);
	    else if ( tuition <=1300)   
	         rebate = 0.70 * 600 + 0.50 * 300  + .3 * ( tuition - 900);//___________________________________(4)
	    else
	         rebate = .70 * 600 + .50 * 300 + .3 * 400;  
	 }
	public void printInfo ()
	{
	   System.out.println ( " Name is " + name );
	   System.out.println ( " Tuition is " + tuition );//_____________________________________________(5)_
	   System.out.println ( "Rebate is " + rebate );
	}

}
