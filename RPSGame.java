import java.util.Scanner;
import java.util.Random;
public class RPSGame 
{
	byte c=1,a=1;
	int userIP,randomNO;
	Scanner sc = new Scanner(System.in);
	void decision (int userIP,int randomNO)
	{
			System.out.println("UserIP"+userIP);
			System.out.println("BotIP"+randomNO);
			if (userIP == randomNO)
			{
				System.out.println("Play Again");
				Scanner sc = new Scanner(System.in);
				getIP();
			}
			else if((userIP==1 && randomNO==3)||(userIP == 2 && randomNO==1)|| (userIP == 3 && randomNO==2))
			{
				System.out.println("You won the game");
			}
			else
			{
				System.out.println("You lost Bot won the Game");
			}		
	}
	void getIP()
	{
		System.out.println("Enter your choise");
		System.out.println("1 for Rock");
		System.out.println("2 for Paper");
		System.out.println("3 for Secissor");
		int userIP = sc.nextInt();
		Random random = new Random();
		int randomNO = random.nextInt(3)+1;
		decision(userIP,randomNO);
	}
	public static void main(String args[])
	{
		byte a=1;
		RPSGame s = new RPSGame();
		Scanner sc = new Scanner(System.in);
		s.getIP();
		System.out.println("Enter 1 to continue any other to exit");
		a = sc.nextByte();
		while(a==1) 
		{
			s.getIP();
			System.out.println("Enter 1 to continue any other to exit");
			a = sc.nextByte();	
		}	
		System.out.println("Thank for Playing with me");
	}
}
