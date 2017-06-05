package lab12Package;

import java.util.Scanner;

public class IS612StudentClassDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		IS612StudentClass iS612StudentClass = new IS612StudentClass();
		System.out.println("Enter your name");
		iS612StudentClass.setName(keyboard.next());
		System.out.println("Enter your major in the school of CSIS");
		iS612StudentClass.setMajor(keyboard.next());
		System.out.println("Enter your faculty advisor's name");
		iS612StudentClass.setAcademicAdvisor(keyboard.next());
		System.out.println("Enter the hours you studied");
		iS612StudentClass.setHours(keyboard.nextInt());
		System.out.println("Enter the grade that you are expecting");
		iS612StudentClass.setGrade(keyboard.next());
		iS612StudentClass.writeOutput();
		
	}

}
