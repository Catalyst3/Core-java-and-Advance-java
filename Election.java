package ExceptionHandling;

public class Election 
{
    public static void main(String[] args) 
    {
    	try
    	{
    		int age = 12;
        	checkAge(age);
    	}
    	catch(UnderAgeException e)
    	{
    		System.out.println("Reason :"+e);
    	}
    }
    public static void checkAge (int age) throws UnderAgeException
	{
		if (age<18)
		{
			throw new UnderAgeException("Your Under Age");
		}
		else 
		{
			System.out.println("You can Vote");
		}
	}  	  
}
class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super (msg);
	}
}   
