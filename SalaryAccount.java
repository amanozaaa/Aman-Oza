package bank;

public class SalaryAccount extends Account{
	
	private int transactiocount;
 
	public SalaryAccount(int actID, String acnName, double balance) {
		super(actID, acnName, balance);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
		System.out.println(amount+ " deposited successfully...!");
		transactiocount++;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println(amount+ " withdrawn successfully...!");
			transactiocount++;
		}
		else
			System.out.println("Insufficent balance...!");
		
	}

	@Override
	public void calculateInterest(double rate, int years) {
		// TODO Auto-generated method stub
		double interest = (balance*rate*years)/100;
		balance+=interest;
		System.out.println("Interested added and now balance is: "+balance);
		
	}
	
	public void checkTransaction()
	{
		System.out.println("Total number of transactions are: "+transactiocount);
	}
	
	
	
}
