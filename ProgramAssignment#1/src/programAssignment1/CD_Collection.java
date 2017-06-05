package programAssignment1;

public class CD_Collection {

	private int CD;
	private double price;
	private double averageCost;
	
	public CD_Collection(int newCD, double newPrice){
		CD = newCD;
		price = newPrice;
	}
	public void addToCollection(int newCD, double newPrice){
		CD = CD + newCD;
		price = price + newPrice;
	}
	
	public void sellFromCollection(int newCD, double newPrice){
		if (CD >= newCD){
			CD = CD - newCD;
			price = price - newPrice;
		}
		else
			System.out.println("you do not have enough CDs");
	}
	
	public void displayCollection(){
		System.out.println("The total number of CDs are "+ CD);
		System.out.println("The total price of the CDs is "+ price);
	}
	
	public double getAverageCost(){
		averageCost = (double)CD / price;
		return averageCost;
	}
    
}
