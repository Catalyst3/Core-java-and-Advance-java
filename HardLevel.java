/*3. Define an interface called Calculatable with two methods: double calculateArea() and double calculatePerimeter(). 
 * Implement this interface in three classes: Rectangle, Circle, and Triangle. Each class should provide its own implementation of the area 
 * and perimeter calculations. Create objects of all three classes and invoke their respective calculation methods.*/
package Example;
interface Calculatable
{
	double calculateArea();
	double calculatePerimeter();
}
class Rectangles implements Calculatable
{
	int side1 = 12, side2 = 5;
	double area,perimeter;
	public double calculateArea()
	{
		area = side1*side2;
		return area;
	}
	public double calculatePerimeter()
	{
		perimeter = side1+side2;
		return perimeter;
	}
}
class Circles implements Calculatable
{
	double area,perimeter;
	int radius=12;
	public double calculateArea()
	{
		area = 2*3.14*radius*radius;
		return area;
	}
	public double calculatePerimeter()
	{
		perimeter = 2*3.14*radius;
		return perimeter;
	}
}
class Triangle implements Calculatable
{
	double area, perimeter;
	int base=12,height=5;
	int side1=12,side2 =12,side3=12;
	public double calculateArea()
	{
		area = 0.5*base*height;
		return area;
	}
	public double calculatePerimeter()
	{
		perimeter = side1+side2+side3;
		return perimeter;
	}
}
public class HardLevel 
{
	public static void main(String[] args) 
	{
		Calculatable rectangles = new Rectangles();
		double a = rectangles.calculateArea();
		System.out.println("Area of rectangle "+a);
		double b = rectangles.calculatePerimeter();
		System.out.println("Perimeter of Rectangle "+b);
		Calculatable circles = new Circles();
		double c = circles.calculateArea();
		System.out.println("Area of Triangle "+c);
		double d = circles.calculatePerimeter();
		System.out.println("Perimeter of Triangle "+d);
		Calculatable triangle = new Triangle();
		double x = triangle.calculateArea();
		System.out.println("Area of Triangle "+x);
		double y = triangle.calculatePerimeter();
		System.out.println("Perimeter of Triangle "+y);	
	}

}
