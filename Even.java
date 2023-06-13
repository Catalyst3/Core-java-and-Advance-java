import java.util.Scanner;
public class Even 
{
	void even()
	{
		System.out.println("Enter Last natural no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short i=0;
		while (i<=n)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String args[])
	{
		Even s = new Even();
		s.even();
	}

}
