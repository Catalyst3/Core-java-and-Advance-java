package ParameterPassing;

public class IntPassing 
{
	void show(int a)
	{
	    System.out.println(a);
	}
	public static void main(String args[])
	{
		IntPassing s = new IntPassing();
		s.show(10);
	}
}
