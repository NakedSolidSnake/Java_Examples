package entities;

public class Account {
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account(Integer number, String holder, Double balance) {		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}
	
	protected void withdraw(Double amount) {
		this.balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
}
