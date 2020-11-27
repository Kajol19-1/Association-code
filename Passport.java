import java.lang.*;

public class Passport
{
	private String passHoldername;
	private String passNo;
	private String expiredate;

	public Passport()
	{

	}
	
	public Passport(String passHoldername, String passNo, String expiredate )
	{
		this.passHoldername = passHoldername;
		this. passNo = passNo;
		this.expiredate = expiredate;
	}

	
	public void showDetails()
	{
		System.out.println("Password Holdername: "+passHoldername);
		System.out.println("Password no: "+ passNo);
		System.out.println("Epire Date: "+expiredate);

	}

	public  void setpassHoldername(String passHoldername)
	{
		this.passHoldername = passHoldername;
	}

	public  void setpassNo(String passNo)
	{
		this.passNo = passNo;
	}
	
	public  void setExpiredate(String expiredate)
	{
		this.expiredate = expiredate;
	}

	public  String getpassHoldername()
	{
		return passHoldername;
	}

	public  String getpassNo()
	{
		return passNo;
	}
	
	public  String getExpiredate()
	{
		return expiredate;
	}

	

}