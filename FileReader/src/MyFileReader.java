import java.io.IOException;
import java.util.Scanner;


public class MyFileReader {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter double value");
		Scanner keyboard = new Scanner(System.in);
		
		Double var = keyboard.nextDouble();
		System.out.println(var.getClass());	
		
		System.out.println("Enter double value");
		String newstr = keyboard.next();
		System.out.println(newstr.getClass());	
		System.out.println(newstr);
		
		Integer somevar = Integer.parseInt(newstr);
		System.out.println(somevar.getClass());	
		System.out.println(somevar);
	}

}
