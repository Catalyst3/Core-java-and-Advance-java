package Abstration;

abstract class Shape
{
	int side1,side2;
	Shape(int side1,int side2)
	{
		this.side1=side1;
		this.side2=side2;
	}
	abstract void calculateArea();
}
class Rectangle extends Shape
{
	Rectangle(int side1,int side2)
	{
		super(side1,side2);
	}
	void calculateArea()
	{
		float area = side1*side2;
		System.out.println("Area of rectangle "+area);
	}
}
class Triangle extends Shape
{
	Triangle(int side1,int side2)
	{
		super(side1,side2);
	}
	void calculateArea()
	{
		float area = 0.5f*side1*side2;
		System.out.println("Area of Trianglge "+area);
	}	
}
public class Main_Area 
{
	public static void main(String args[])
	{
		Shape rectangle = new Rectangle(12,15);
		rectangle.calculateArea();
		Shape triangle = new Triangle(15,16);
		triangle.calculateArea();
	}
}
