package programAssignment1;

public class CDDemo {

	public static void main(String[] args) {
		    {
		       double averageCost;
		       CD_Collection  music = new CD_Collection ( 5, 59.68);// first number is the quantity of the original collection, second number is

		                                                                                    // the cost of the entire collection

		       music.addToCollection( 1, 10.99);  // one more CD is added at the price of that CD for 10.99
		       music.addToCollection (3, 39.54);   // three more CD's are added with a  price of  39.54 for those three CD's  
		       music.addToCollection(2,  24.73);   // 2 more CD's are added to the collection with a total price of 24.73 for those 2 CD's
		       music.sellFromCollection ( 2,  13.45);    // selling two cd's at a total price of 13.45 for those 2 CD's  
		       music.displayCollection ();
		       averageCost = music.getAverageCost ();
		       System.out.println ( "The average cost is " + averageCost );
		     }
		}
}


