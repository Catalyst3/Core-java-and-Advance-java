package Loop;
import java.util.Scanner;
public class DriverSelection 
{
	void selection(byte status, byte age, byte gender)
	{
		if (status == 0)
		{
			if (age >=30 && age <= 50)
			{
				System.out.println("Your selected");
			}
			else
			{
				System.out.println("Your NotSelected");
			}	
		}
		else 
		{
			if (gender == 1)
			{
				if (age >= 25 && age <= 55)
				{
					System.out.println("Your selected");
				}
				else 
				{
				System.out.println("Your NotSelected");
				}
			}
			else
			{
				if (age >= 30 && age <= 50)
				{
					System.out.println("Your selected");
				}
				else 
				{
				System.out.println("Your NotSelected");
				}
			}
		}
	}
	public static void main(String args[])
	{
		DriverSelection s = new DriverSelection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 if you are married else enter 0");
		byte status=(byte) sc.nextByte();
		System.out.println("Enter your age");
		byte age = (byte)sc.nextByte();
		System.out.println("Enter 1 if you are male 2 if you are female");
		byte gender = (byte) sc.nextByte();
		s.selection(status,age,gender);
		
	}

}
