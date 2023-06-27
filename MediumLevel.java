package ExceptionHandlingExamples;
/*
 * Write a program that simulates a voting system. Create a class called Voter with attributes such as name and age. 
 * Implement a method registerVote() that throws a custom exception InvalidVoteException if the voter's age is less than 18. 
 * Handle the exception and display a message stating that the voter is not eligible to vote.*/
import java.util.Scanner;
class InvalidVoteException extends Exception
{
	public InvalidVoteException(String msg)
	{
		super(msg);
	}
}
class Voter
{
	static String name;
    static int age;
	public static void registerVote(String name,int age)throws InvalidVoteException
	{
		Voter.name=name;
		if (age<18)
		{
			throw new InvalidVoteException("Your Under Age");
		}
		else	
		{
			System.out.println("You can vote");
		}
	}
}
class ShowInfo extends Voter
{
	static void showDetailsOfVoter()
	{
		System.out.println("Voter Name: "+name);
		System.out.println("Voter age: "+age);
	}
}
public class MediumLevel extends ShowInfo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = sc.nextLine();
		System.out.println("Enter your Age");
		age = sc.nextInt();
		try
		{
			registerVote(name,age);
		}
		catch(InvalidVoteException e)
		{
			System.out.println("Reason :"+e);
		}
		showDetailsOfVoter();
	}

}
