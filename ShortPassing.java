package ParameterPassing;

public class ShortPassing 
{
	void show (short a)
	{
		System.out.println(a);	
	}
	public static void main(String args[])
	{
		ShortPassing b = new ShortPassing();
		b.show((short)10);
	}
}