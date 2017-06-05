package gradingProgram;

import java.util.Scanner;

public class StudentRecord {
	private double quizOne;
	private double quizTwo;
	private double midterm;
	private double finalExam;
	private double totalScore;
	private char finalLetterGrade;

	public StudentRecord(){
		quizOne=0;
		quizTwo=0;
		midterm=0;
		finalExam=0;
	}
	
	public void getInput ()
	{
		System.out.println("Enter your quizOne score ");
	    Scanner keyboard = new Scanner (System.in ); 
	    quizOne = keyboard.nextDouble();
	
		System.out.println("Enter your quizTwo score ");
		quizTwo = keyboard.nextDouble(); 
		
		System.out.println("Enter your midterm score ");
		midterm = keyboard.nextDouble(); 
		
		System.out.println("Enter your finalExam score ");
		finalExam = keyboard.nextDouble();
		
		if(quizOne > 10 || quizOne < 0|| quizTwo > 10 || quizTwo < 0 || midterm > 100 || midterm < 0 || finalExam > 100 || finalExam < 0)
		{
			System.out.println("Enter your valid score ");
			System.exit(0);
		}
				
	}
	
	public void calculateTotalScore()
	{
		totalScore = 0.25 * (quizOne + quizTwo) * 5 + 0.25 * midterm + 0.5 * finalExam;
	}
	
	public void calculateFinalLetterGrade()
	{ if (totalScore>=90)
		  finalLetterGrade = 'A';
	  else if (totalScore >=80 && totalScore <=89)
		  finalLetterGrade = 'B';
	  else if (totalScore >=70 && totalScore <=79)
		  finalLetterGrade = 'C';
	  else if (totalScore >=60 && totalScore <=69)
	      finalLetterGrade = 'D';
	  else
	      finalLetterGrade = 'F';
	
	}
	public void writeOutput ()
	{
		System.out.println("Enter your totalScore score " + totalScore);
		System.out.println("Enter your finalLetterGrade score " + finalLetterGrade);
	
	}
	
	public double getTotalScore(){
		return totalScore;
	}
	
	public char getFinalLetterGrade(){
		return finalLetterGrade;
	}

}