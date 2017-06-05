package question6;

public class PersonDemo {

	public static void main(String[] args) {
		Person vikram = new Person();
		Person divya = new Person();
		vikram.setVariables("divya", 26);
		divya.setVariables("divya", 26);
		vikram.printVariable();
		divya.printVariable();
		System.out.println("vikram object is stored at "+vikram);
		System.out.println("divya object is stored at "+divya);
		System.out.println(vikram==divya);
		System.out.println(vikram.equals(divya));
		int x=2;
		vikram.increaseAge(x);
		System.out.println(x);
		int y=vikram.age;
		vikram.trickyIncreaseAge(y);
		System.out.println(vikram.age);
		System.out.println(y);
	}

}
