import java.lang.*;

public class main
{
	public static void main(String args[])
{
	BankAccount ob1=new BankAccount();
	ob1.setaccountNo("165253");
	ob1.setBalance(6500.0);
	
	System.out.println("Account No:" +ob1.getaccountNo());
	System.out.println("Balance available:" +ob1.getBalance());
	
	BankAccount ob2=new SavingAccount("14521",600.0,50.0);
	ob2.showDetails();
	
	BankAccount ob3=new Fixedaccount("256561",600.0,2025);
	ob3.showDetails();
	
}
	
	
	
}