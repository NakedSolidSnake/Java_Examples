package entitites;

public class BussinessAccount extends Account{
	private double loanLimit;
	
	public BussinessAccount() {
		super();
	}

	public BussinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit)
			deposit(amount - 10.0);
	}
	
}
