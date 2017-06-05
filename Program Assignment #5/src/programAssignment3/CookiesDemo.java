package programAssignment3;
import java.io.IOException;

public class CookiesDemo {
	public static void main(String args[]) throws IOException
	{ 
		Cookies myCousin = new Cookies();
		myCousin.readInput();
		myCousin.updateData();
//		myCousin.displaySalesList();
		myCousin.sortByTeachersName();
		System.out.println("Below is final list sorted by teacher's name");
		myCousin.displaySalesList();
		myCousin.sortByQuantity();
		System.out.println("************************************************");
		System.out.println("Below is final list sorted by quantity in descending order");
		myCousin.displaySalesList();
		System.out.println("************************************************");
		myCousin.winnerOfSales();
	}
}
