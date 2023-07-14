package bank;

public class LoanAccount extends Account{

	private double repaidAmount;
	public LoanAccount(int actID, String acnName, double loanamount) {
		super(actID, acnName, loanamount);
		// TODO Auto-generated constructor stub
		this.repaidAmount=0;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		repaidAmount+=amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Loan is already paid to customer of amount "+balance);
		
	}

	@Override
	public void calculateInterest(double rate, int years) {
		// TODO Auto-generated method stub
		double interest = (balance*rate*years)/100;
		balance+=interest;
		System.out.println("Interest calculated and added to the account loan balance.");
		
	}
    
	public void printPaidAmout()
	{
		System.out.println("Amount repaid: " + repaidAmount);
	}
}

