import java.lang.*;

import java.lang.*;

public class BankAccount
{
	protected String accountNo;
	protected double balance;
	
	public BankAccount()
	{
		
	}
	public BankAccount(String accountNo, double balance)
	{
		this. accountNo = accountNo;
		this.balance = balance;
	}
	public void showDetails()
	{
		System.out.println("Account No:" +accountNo);
		System.out.println("Account Available:" +balance);
	}
	public void setaccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getaccountNo()
	{
		return accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
}