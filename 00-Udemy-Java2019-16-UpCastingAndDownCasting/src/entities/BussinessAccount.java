package entities;

public class BussinessAccount extends Account{
	private Double loanLimit;

	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit)
			balance += (amount - 10.0);
			
	}

}
