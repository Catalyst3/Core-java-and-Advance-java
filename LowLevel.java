/*Define an interface called Resizable with a method resize(int percentage). Implement this
 interface in a class called Rectangle that prints "Resizing Rectangle by {percentage}%"
 when the resize() method is called.*/
package Example;
import java.util.Scanner;
interface Resizable
{
	void resize(int percentage);
}
class Rectangle implements Resizable
{
	float area;
	public void resize(int percentage)
	 {
		System.out.println("Enter both Sides");
		 Scanner sc = new Scanner(System.in);
		 int side1 = sc.nextInt();
		 int side2 = sc.nextInt();
		 area = side1*side2;
		 System.out.println("Area Before Resizing "+area);
		 area = area*percentage*0.01f;
		 System.out.println("Area After Resizing "+area);
	 }	 
}
public class LowLevel 
{
	public static void main(String args[])
	{
		Resizable resizeable = new Rectangle();
		resizeable.resize(50);
	}
	
}
