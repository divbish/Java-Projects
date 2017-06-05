
public class StockClass {
	private String stockName;
	private int numberOfStocks;
	private double price ;
	private String purchaseDate;
	
	public StockClass(String newStockName,int newNumberOfStocks, double newPrice,String newPurchaseDate)
	{
	stockName = newStockName;
	numberOfStocks = newNumberOfStocks;
	price = newPrice;
	purchaseDate = newPurchaseDate;
	}
	public void add (int newNumberOfStocks, double newPrice)
	{
		numberOfStocks = numberOfStocks + newNumberOfStocks;
		price = price + newPrice;
	}
	public void sell (int newNumberOfStocks, double newPrice)
	
	{
		numberOfStocks = numberOfStocks - newNumberOfStocks;
		price = price - newPrice;
    }
	public void print ()
	{
		System.out.println("name of stock is " + stockName);
		System.out.println("number of stocks is " + numberOfStocks);
		System.out.println("price of stock is " + price);
		System.out.println("purchase date of stock is " + purchaseDate);
	}
	public boolean worthwhile ()
	{
		if (numberOfStocks<=500)
			return true;
		else
			return false;
			
	}
}
