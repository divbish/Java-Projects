package question6;

public class Quiz1 {
	private double salary;
	private double taxes;

	public double findTaxes ( double income)
	{ 
	   if ( income <= 50000){
		   taxes= 0.03*income;//1
	   }
	   else if(income>50000 && income<=100000){// ________________________________________ (2)
	          taxes = .03 * 50000 + .05 * ( income - 50000);
	   }
	   else
		   taxes = .03 * 50000 + .05 * 50000 + .08 * ( income - 100000);//     _________________________________________ (3)

	return taxes; 
	}
}
	      
