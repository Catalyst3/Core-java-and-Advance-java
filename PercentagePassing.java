package ArithmaticPassing;

public class PercentagePassing 
{
	void calculate(byte math, byte sci, byte his, byte lan)
	{
		int sum = math+sci+his+lan;
		float percentage = sum/4;
		System.out.println("Total mark for Four subject is: "+ sum);
		System.out.println("---------------------------------");
		System.out.println("Percentage for Four subjects is: "+ percentage);
		System.out.println("---------------------------------");
	}
	public static void main(String args[])
	{
		PercentagePassing d = new PercentagePassing();
		d.calculate((byte) 98,(byte) 90,(byte)89,(byte) 88);
	}
}