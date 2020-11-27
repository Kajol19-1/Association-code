import java.lang.*;

public class Person
{
	String name;
	String age;
	String address;
	Passport account;

   Person()
	{
		
	}

	public Person(String name, String age, String address, Passport account )
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.account= account;

	}

	public String getName()
        {
		return name;
	}

	public String getAge()
        {
		return age;
	}

	public String getAddress()
        {
		return address;
	}

	public Passport getAccount()
        {
		return account;
	}
	
	public void print_info()
	{
		System.out.println("Person name: " +name);
		System.out.println("Person Age: " +age);
		System.out.println("Person address: "+address);
		System.out.println("Person Account: "+account);

		
	}


	


	
}