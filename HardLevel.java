/*Create a class called Rectangle with private instance variables length (double) and width (double). 
 * Implement getter and setter methods for both variables. Additionally, add a public method called calculateArea that returns the area of the 
 * rectangle (length * width). Ensure that the setter methods validate that both length and width are positive values, and if not, set them to 0.*/
package EncapExample;

import java.util.Scanner;

class Rectangle
{
	private double length;
	private double width;
	public void setLength(double length)
	{
		if (length<=0)
		{
			length=0;
			this.length=length;
		}
		else
		{
			this.length = length;
		}
		
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double width)
	{
		if (width<=0)
		{
			width=0;
			this.width=width;
		}
		else 
		{
			this.width = width;
		}	
	}
	public double getWidth()
	{
		return width;
	}
	public double calculateArea()
	{
		double area=0;
		area= length*width;
		return area;
	}
}
public class HardLevel {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle ");
		double length = sc.nextDouble();
		System.out.println("Enter width of Rectangle");
		double width = sc.nextDouble();
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(length);
		rectangle.setWidth(width);
		double area = rectangle.calculateArea();
		System.out.println("Area of Rectangle is "+area);
	}
}
