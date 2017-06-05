package gradingProgram;

public class StudentRecordDemo {

	public static void main(String[] args) {
		StudentRecord studentRecord  = new StudentRecord();
		studentRecord.getInput();
		studentRecord.calculateTotalScore();
		studentRecord.calculateFinalLetterGrade();
		studentRecord.writeOutput();
	}

}
