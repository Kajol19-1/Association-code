import java.lang.*;

public class SavingAcc extends BankAccount
{
	public double interestRate;
	
	public SavingAccount()
	{
		
	}
	public SavingAccount(String accountNo, double balance, double interestRate)
	{
		super(accountNo,balance);
		this.interestRate = interestRate;
	}
	public void showDetails()
	{
		System.out.println("SavingAccount No:" +accountNo);
		System.out.println("SavingAccount Balance:" +balance);
		System.out.println("SavingAccount interestRate:" +interestRate);
		
	}
	
	
}