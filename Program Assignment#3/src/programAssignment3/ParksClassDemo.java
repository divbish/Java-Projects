package programAssignment3;

public class ParksClassDemo {

	public static void main (String [] args){
		
		ParksClass winterSports = new ParksClass ();
		for ( int i = 1; i <=10; i ++)
		{
			winterSports.getFamilyInfo(); 
			winterSports.figureFamilyFeeAndAccumulate();
			winterSports.printFamilyInfo();
		}
		winterSports.printAllTotals();
     }
	}
