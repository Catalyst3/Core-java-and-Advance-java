import java.util.Scanner;
public class SumOfNaturalNo 
{
	void sum()
	{
		System.out.println("Enter last natural number");
		Scanner sc = new Scanner(System.in);
		short n = sc.nextShort();
		short i=1,sum = 0;
		while (i<=n)
		{
			 sum = (short) (sum+i);
			i++;
		}
		System.out.println("sum is "+sum);
	}
	public static void main(String args[])
	{
		SumOfNaturalNo a = new SumOfNaturalNo();
		a.sum();
	}
}
