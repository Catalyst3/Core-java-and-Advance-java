/*2. Define an interface called Drawable with a method draw(). Implement this interface in two classes, Circle and Square. 
 * In the Circle class, print "Drawing Circle" in the draw() method, and in the Square class, print "Drawing Square". 
 * Create objects of both classes and call their draw() methods.*/
package Example;
interface Drawable
{
	void draw();
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}
class Square implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}
}
public class MediumLevel 
{
	public static void main(String[] args) 
	{
		Circle circle = new Circle();
		circle.draw();
		Square square = new Square();
		square.draw();
	}

}
