package Loop;
import java.util.Scanner;
public class Bank 
{
	int balance = 100000;
	short pin = 1234;
	int limit = 25000; 
	int total =0;
	Scanner sc = new Scanner(System.in);
	void pinCheck()
	{
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your 4 digit pin");
			short check = sc.nextShort();
			if (check == pin)
			{
				System.out.println("you are login");
				System.out.println("----------------------------------------");
				
				break;
			}
			else
			{
				System.out.println("Entered pin is Wrong");
				System.out.println("Try again");
				System.out.println("----------------------------------------");
			}
		}while(true);
	}
	void withdraw()
	{
		int withdraw = 0;
		System.out.println("Enter ammount you want to Withdraw");
		System.out.println("----------------------------------------");
		withdraw= sc.nextInt();
		if(withdraw <= 25000)
		{
			if(total < limit )
			{
				if (withdraw > balance)
				{
					System.out.println("insufficient Balance");
					System.out.println("----------------------------------------");
				}
				else
				{
					balance = balance - withdraw;
					System.out.println("Your remaining balance is :"+balance);
					total = total +withdraw;
				}	
			}
			else
			{
				System.out.println("Daily limit Reached");
				System.out.println("---------------End of Todays Transactions --------------------");
			}
		}
		else 
		{
			System.out.println("plese Enter less than 25001");
			System.out.println("----------------------------------------");
		}	
	}
	void checkBalance()
	{
		System.out.println("Your Balance is :"+balance);
		System.out.println("----------------------------------------");
	}
	void deposit()
	{
		System.out.println("Enter Ammount you want to deposit in your bank account");
		System.out.println("----------------------------------------");
		int deposit = sc.nextInt();
		balance = balance + deposit;
		System.out.println("Your Balance is :"+balance);
		System.out.println("----------------------------------------");
	}
	public static void main(String args[])
	{
		Bank s = new Bank();
		Scanner sc = new Scanner(System.in);
		s.pinCheck();
		byte c=0;	
			do 
			{
				System.out.println("Enter you choise");
				System.out.println("Enter 1 to Withdraw ammount");
				System.out.println("Enter 2 to Deposit ammount");
				System.out.println("Enter 3 to Check Your Balance");
				System.out.println("----------------------------------------");
				int choice = sc.nextInt();
				switch (choice)
				{
				case 1:
				{
					s.withdraw();
					System.out.println("Thank you for visit");
					System.out.println("----------------------------------------");
					break;
				}
				case 2:
				{
					s.deposit();
					System.out.println("Thank you for visit");
					System.out.println("----------------------------------------");
					break;
				}
				case 3:
				{
					s.checkBalance();
					System.out.println("Thank you for visit");
					System.out.println("----------------------------------------");
					break;
				}
				default :
				{
					System.out.println("Input is Wrong");
					System.out.println("----------------------------------------");
					break;
				}
				}
				System.out.println("Enter 1 if you want to Continue or 2 to Exit");
				System.out.println("----------------------------------------");
				c= sc.nextByte();
			}while(c==1);
			System.out.println("Thank you for visit");	
			System.out.println("----------------------------------------");
	}
}
