package Interface;
interface A
{
	void show();
}
interface B
{
	void show();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("HEllo");
	}
}
public class MultipleInheritance 
{
	public static void main(String args[]) 
	{
		B b = new C();
		b.show();
		A a = new C();
		a.show();
	}
}
