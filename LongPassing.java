package ParameterPassing;

public class LongPassing {
	void show(long a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		LongPassing d = new LongPassing();
		d.show(19998989898989L);
  }
}