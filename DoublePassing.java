package ParameterPassing;

public class DoublePassing 
{
	void show(double a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		DoublePassing d = new DoublePassing();
		d.show(33.44);
	}

}
