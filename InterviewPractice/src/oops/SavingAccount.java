package oops;

public class SavingAccount extends BankAccount {

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int deposit(int amount){//Overridden method
		return 2;
	}
	
	@Override
	public int withdraw(int amount){//Overridden method
		return 100;
	}
	
	public int withdraw(String a){//Overloaded method
		return 200;
	}

}
