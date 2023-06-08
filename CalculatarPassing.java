package ArithmaticPassing;

public class CalculatarPassing {
	void add(byte a, byte b)
	{ 
		int c=a+b;
		System.out.println("Addition is :"+c);
		System.out.println("___________________________");
	}
	void sub(byte a, byte b)
	{
		int c=a-b;
		System.out.println("Substraction is :"+c);
		System.out.println("___________________________");
	}
	void multi(byte a, byte b)
	{
		int c=a*b;
		System.out.println("Multiplication is :"+c);
		System.out.println("___________________________");
	}
	void divi(byte a, byte b)
	{
		int c = a/b;
		System.out.println("Division is :"+c);
		System.out.println("___________________________");
	}
	public static void main(String args[])
	{
		CalculatarPassing b = new CalculatarPassing();
		b.add((byte) 4, (byte)5);
		b.sub((byte) 5, (byte)2);
		b.multi((byte) 6, (byte)3);
		b.divi((byte) 20, (byte)5);
    }
}
