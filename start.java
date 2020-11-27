import java.lang.*;

public class Start
{

	public static void main(String args[])
	{

		Passport pas1= new Passport();
		Passport pas1= new Passport();
		pas1.setpassHoldername("Kajol khan");
		pas1.setExpiredate("20 jan,2021");
		pas1.setpassNo("26874");

		Passport pas2= new Passport();
		pas2.setpassHoldername("Nihad khan");
	    pas2.setExpiredate("09 Oct,2025");
		pas2.setpassNo("45654");
		
		Person per1= new Person("Nahid", "20","Dhaka",pas1);
		Person per2= new Person("Sakib","21","Bogura",pas2);
		
		per1.print_info();
		System.out.println();
		per2.print_info();
		System.out.println();
		
		


	}

}