
public class ByteData 
{
	byte a = 127;
	void display()
	{
		System.out.println(a);
		System.out.println("Byte value is "+a);
	}
	public static void main(String args[])
	{
		ByteData b = new ByteData();
		b.display();
	}

}
