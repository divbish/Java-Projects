import java.io.IOException;


public class TestTwo {
	private double [] sales = new double [500]; 
	
	public void getSalesData(){
		for(int i =0; i< 500; i++)
			sales[i]=i+0.1;
	}
	public void calculateAverage (){
		double sum = 0;
		for(int i =0; i<500; i++){
			sum = sum + sales[i];
		}
		double average = sum/500;
		System.out.println(sum);
		System.out.println(average);
	}
	
	public static void main(String args[]){
		TestTwo testTwo = new TestTwo();
		testTwo.getSalesData();
		testTwo.calculateAverage();
	}

}
