
public class Bank 
{
	void withdrawal()
	{
		System.out.println("Enter your pin");
		System.out.println("Enter ammount");
	}
	void deposit()
	{
		System.out.println("Enter your pin");
		System.out.println("Enter account number");
		System.out.println("Enter ammount");
	}
	void balanceInquiry()
	{
		System.out.println("Enter your pin");
		System.out.println("Emter account number");
	}
	void openBankAccount()
	{
		System.out.println("Enter your name");
		System.out.println("Enter your address");
		System.out.println("Enter your Phone number");
	}
	public static void main(String args[])
	{
		Bank a2 = new Bank();
		a2.openBankAccount();
	}

}
