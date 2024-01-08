package classTemplate;

import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg) {
		super(msg);
	}
}

class NetBanking
{
	int userid = 1234;
	int password = 2222;
	int uid;
	int pw;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the uid :: ");
		uid = sc.nextInt();
				
		System.out.println("Enter the pswd :: ");
		pw = sc.nextInt();
		
	}
	
	void verify() throws InvalidCustomerException
	{
		if((userid==uid)&&(password==pw))
		{
			System.out.println("Take your cash");
		}
		else
		{
			InvalidCustomerException ice = new InvalidCustomerException("wrong pswd.do you wanna try again!");
			System.out.println(ice.getMessage());
			throw ice;
		}
		
	}
	
}

class Bank
{
	public void initiate() {
	NetBanking atm = new NetBanking();
	try {
		atm.input();
		atm.verify();
	}
	catch(InvalidCustomerException ice)
	{
		try {
			atm.input();
			atm.verify();
		}
		catch(InvalidCustomerException ice2)
		{
			try {
				atm.input();
				atm.verify();
			}
			catch(InvalidCustomerException ice3)
			{
				System.out.println("your account is blocked temporarily!");
				System.exit(0);
			}
		}
	}
	}
	
}

public class ATM {

	public static void main(String[] args) {
//		ATMmachine atm = new ATMmachine();
		Bank b = new Bank();
		b.initiate();
	}

}
