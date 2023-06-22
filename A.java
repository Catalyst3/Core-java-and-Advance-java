package Encapsulation;
class B
{
	private int age;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
}
class A
{
	public static void main(String args[])
	{
		B b = new B();
		b.setAge(25);
		System.out.println("Age is:"+b.getAge());	
	}
	
}