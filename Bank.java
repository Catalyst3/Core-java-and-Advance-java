package ByUser;
import java.util.Scanner;
public class Bank 
{
	int balance=100000;
   void checkBalance()
   {
	   System.out.println("Your balance is "+balance);
	   System.out.println("---------------------------------");  
   }
   void withdraw(int amount)
   { 
	   balance = balance - amount;
	   System.out.println("---------------------------------");
	   System.out.println("Your balance after withdraw is :"+balance);
	   System.out.println("---------------------------------");
   }
   void deposit(int amount)
   {
	   balance = balance + amount;
	   System.out.println("---------------------------------");
	   System.out.println("Your balance after deposit is :"+balance);  
	   System.out.println("---------------------------------");
   }
   public static void main(String args[])
   {
	   Bank a = new Bank();
	   a.checkBalance();
	   System.out.println("Enter ammount you want to withdraw"); 
	   Scanner sc = new Scanner(System.in);
	   int amount = sc.nextInt();
	   a.withdraw(amount);
	   System.out.println("Enter ammount you want to deposit");
	   amount = sc.nextInt();
	   a.deposit(amount);
   }
}
