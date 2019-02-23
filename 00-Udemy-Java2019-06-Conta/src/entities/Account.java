package entities;

public class Account {
	private int account_number;
	private String holder;
	private double balance;
	private final double fee = 5.00; 
	
	
	
	
	public Account(int account_number, String name, double balance) {
		super();
		this.account_number = account_number;
		this.holder = name;
		deposit(balance);
	}	
	
	public Account(int account_number, String name) {
		super();
		this.account_number = account_number;
		this.holder = name;
	}

	public int getAccount_number() {
		return account_number;
	}	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}	

	public void withdraw(double balance)
	{
		if(balance > this.balance)
			return ;
		this.balance -= (balance + fee );			
		
	}
	
	public void deposit(double balance)
	{
		if(balance <= 0)
			return;
		this.balance += balance;
	}

	public String toString()
	{
		return "Account "
				+ this.account_number
				+", Holder: "
				+holder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}






	
}
