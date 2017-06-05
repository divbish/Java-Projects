package labFourPackage;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int i,sum =0,average,grade,worstGrade=100,bestGrade=0;
		final int students = 25;
		for (i=0;i<students;i++)
		{
			System.out.println("Enter grade");
			grade =  keyboard.nextInt();
			if (bestGrade<grade)
			{
				bestGrade =  grade;
			}
			if (worstGrade>grade)
			{
				worstGrade =  grade;
			}
			sum = sum + grade;
		}
		sum = sum - bestGrade - worstGrade;
		System.out.println("The sum of grades of all students except best and worst is "+ sum);
		average = sum/(students-2);
		System.out.println("The average grade of the class except best and worst is "+ average);
		System.out.println("The best grade is "+bestGrade);
		System.out.println("The worst grade is "+ worstGrade);
	}

}
