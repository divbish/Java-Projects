package lab12Package;

public class IS612StudentClass extends CSISstudentClass{
	private String grade;
	private int hours;
	
	public IS612StudentClass(){
		super();
		grade = "A";
		hours = 25;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("The grade is "+ grade);
		System.out.println("The hours are "+ hours);
	}
	
	public void setHours(int newHours){
		hours = newHours;
	}
	
	public void setGrade(String newGrade){
		grade = newGrade;
	}

}
