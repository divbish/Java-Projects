package oops;

public class BankAccount implements Account{
	private int accountNumber;
	private String[] customerName = {"vikram", "divya", "inaya"};
	protected int balance;
	
	@Override
	public int withdraw(int amount){
		return 1;
	}

	@Override
	public int deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
