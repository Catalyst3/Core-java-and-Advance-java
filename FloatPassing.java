package ParameterPassing;

public class FloatPassing {
	void show(float a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		FloatPassing b = new FloatPassing();
		b.show(20.2f);
	}
}
