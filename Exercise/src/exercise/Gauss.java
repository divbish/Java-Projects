package exercise;

public class Gauss {

	public static void main(String[] args) {


		//below is the Gauss's solution

		int i, sum=0;

		for(i=1; i <50;i++){

		sum=sum + i + 100 -i;

		}

		sum=sum+50+100;

		System.out.println(sum);

		}


	}


