package ParameterPassing;

public class CharPassing {
	void show(char c)
	{
		System.out.println(c);
	}
	public static void main(String args[])
	{
		CharPassing d = new CharPassing();
		d.show('g');
	}

}
