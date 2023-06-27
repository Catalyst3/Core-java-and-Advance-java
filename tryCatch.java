package ExceptionHandling;

public class tryCatch 
{
	public static void main(String args[])
	{
    try 
    {
    	int a = 6000;
    	int b = 0;
    	int c = a/b;
        System.out.println("Division is :"+c);
    }catch(ArithmeticException e)
    {
    	System.out.println("We failed to divide ");
    	System.out.println("Reason :"+e);
    }
    catch(Exception e)
    {
    	System.out.println("reason :"+e);
    }
    finally
    {
    	System.out.println("End of program");
    }
	
	}

}
