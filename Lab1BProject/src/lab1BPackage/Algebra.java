package lab1BPackage;

public class Algebra 
{
	private int number;
	
	public void printNumber ()
	{
		System.out.println(this.number);
	}
	
	public void setNumber(int n)
	{
		this.number=n;
	}
	
	public int square(int number)
	{
		int square = number * number;
		System.out.println(this.number);
		System.out.println(number);
		return square;
	
	}
	
	public int sum (int n1, int n2)
	{
		int sum = n1+n2; 
		return sum;
		
	}
	
	}
	

	