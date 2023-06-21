package Interface;
interface Student1
{
	void show();
}
interface Student2 extends Student1
{
	void show();
}
class SchoolResult implements Student2
{
	public void show()
	{
		System.out.println("Displayed");
	}
}
public class Student 
{
	public static void main(String args[])
	{
		Student1 student1 = new SchoolResult();
		student1.show();
		Student2 student2 = new SchoolResult();
		student2.show();
	}	
}
