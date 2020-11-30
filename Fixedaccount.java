import java.lang.*;

public class Fixedaccount extends BankAccount
{
	private int tenureYear;
	
   public Fixedaccount()
  {
	
  }
  public Fixedaccount(String accountNo, double balance, int tenureYear)
  {
	  super(accountNo,balance);
	  this.tenureYear = tenureYear;
  }
  public void showDetails()
	{
		System.out.println("FixedAccount No:" +accountNo);
		System.out.println("FixedAccount Balance:" +balance);
		System.out.println("FixedAccount TenureYear:" +tenureYear);
		
	}
  public void SetTenureYear(int tenureYear)
  {
	  this.tenureYear = tenureYear;
  }
  public int getTenureYear()
  {
	  return tenureYear;
  }
  
}