package ExceptionHandlingExamples;
/*Create a program that prompts the user to enter their age. If the age is less than 13, throw a custom exception called
 * UnderAgeException with the message "You must be at least 13 years old to use this program." Handle the exception and display an appropriate
 * error message.*/
import java.util.Scanner;
public class LowLevel {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yor Age");
		try
		{
			int age = sc.nextInt();
			checkAge(age);	
		}catch(UnderAgeException msg)
		{
			System.out.println("Reason  :"+msg);
		}	
	}
	public static void checkAge(int age) throws UnderAgeException
	{
		if (age<13)
		{
			throw new UnderAgeException("Your Under Age");
		}
		else
		{
			System.out.println("You can Use this Program");
		}
	}
}
class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
