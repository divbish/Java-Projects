package oops;

import java.util.Map;

public class AccountTransaction {

	public static void main(String[] args) {
//		SavingAccount savingAccount = new SavingAccount();
//		int balance = savingAccount.withdraw(10);
//		System.out.println(balance);
//		balance = savingAccount.withdraw("Vikram");
//		System.out.println(balance);
		
		//reverse a string
		String[] customerName = {"vikram", "divya", "inaya", "ram", "shyam"};
		String temp;
		for(int i=0; i<customerName.length/2; i++){
			temp=customerName[i];
			customerName[i] = customerName[customerName.length - i - 1];
			customerName[customerName.length -i - 1] = temp;
	}
		for(int j=0; j<customerName.length; j++)
			System.out.println(customerName[j]);
	}
	

}
