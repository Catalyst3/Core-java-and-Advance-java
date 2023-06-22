/*Create a class called BankAccount with private instance variables accountNumber (String) and balance (double). 
 * Implement public setter and getter methods for both variables. Additionally, create a method called deposit that takes a
 *  parameter amount (double) and adds it to the balance.*/
package EncapExample;
import java.util.Scanner;
class BankAccount
{
	private int accountNo;
	private double balance;
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	 void deposit(double a)
	{
		double amount = a;
		balance += amount; 
	}
}
public class LowLevel 
{
	public static void main(String args[])
	{
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.setAccountNo(18010);
		bankAccount.setBalance(10000.0);
		System.out.println("Enter amount you want to deposit");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		bankAccount.deposit(amount);
		System.out.println("Balance After Deposit is :"+bankAccount.getBalance());
		
	}
}
