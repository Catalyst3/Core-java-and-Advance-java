package ArithmaticPassing;

public class AreaPassing 
{
	void circle(byte r)
	{
		float area = 3.14f*r*r;
		System.out.println("Area of Circle is :"+area);
		System.out.println("---------------------------------");
	}
	void square(byte s)
	{
		byte area = (byte) (s*s);
        System.out.println("Area of Square is "+ area); 
        System.out.println("---------------------------------");
	}
	void rectangle(byte s1, byte s2)
	{
		short area = (short)(s1*s2);
		System.out.println("Area of Rectangle is: "+ area);
		System.out.println("---------------------------------");	
	}
	void triangle(byte base, byte height)
	{
		byte area = (byte) (0.5*base*height);
		System.out.println("Area of Triangle is : "+area);
		System.out.println("---------------------------------");
		
		
	}
	public static void main(String args[])
	{
		AreaPassing b = new AreaPassing();
		b.circle((byte)10);
		b.square((byte)7);
		b.rectangle((byte)14,(byte)16);
		b.triangle((byte)10,(byte)15);
	}
}
