
public class ShortData 
{ 
	short a = 32767;
	void display()
	{
	  System.out.println(a);
	  System.out.println("Value of long is "+ a);
	}
	public static void main(String args[])
	{
		ShortData b = new ShortData();
		b.display();
	}

}
