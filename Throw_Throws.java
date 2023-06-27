package ExceptionHandling;

public class Throw_Throws 
{
	public static int divide (int a , int b) throws ArithmeticException
	{
		int c = a/b;
		return c;
	}
	public static void main(String[] args) 
	{
		try{
			int c = divide(6,0);
		}
		catch(Exception e)
		{
			System.out.println("Reason :"+e);
		}
		finally
		{
			System.out.println("Program Completed");
		}

	}
}
