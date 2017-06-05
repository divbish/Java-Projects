package question6;

public class PersonAddressDemo {

	public static void main(String[] args) {
		PersonAddress personOne = new PersonAddress();
		PersonAddress personTwo = new PersonAddress();
		
		personOne.setFirstName("divya");
		personOne.setLastName("bishnoi");
		
		personTwo.setFirstName("vikram");
		personTwo.setLastName("bishnoi");

		if (personOne.equals(personTwo))
			System.out.println("right");
		else
			System.out.println("error");

}
}