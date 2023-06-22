/*Design a class called Student to represent a student's information. The class should have private 
 * instance variables name (String), age (int), and grade (int). Implement the necessary getter and setter methods.
 *  Add a public method called promote that increases the grade of the student by 1. However, the grade should only be 
 *  updated if it is less than or equal to 12.*/
package EncapExample;
import java.util.Scanner;
class Student
{
	private short age;
	private int grade;
	public void setAge(short age)
	{
		this.age = age;
	}
	public short getAge()
	{
		return age;
	}
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	public int getGrade()
	{
		return grade;
	}
	public void promote()
	{
		if (grade<=12)
		{
			grade++;
			System.out.println("Your Grades are Promoted "+grade);
		}
		else
		{
			System.out.println("Your Grades are Not Promoted "+grade);
		}
		
	 System.out.println("Your Age is "+age);
	}
}
public class MediumLevel 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		short age = sc.nextShort();
		Student student = new Student();
		student.setAge(age);
		student.setGrade(10);
		student.promote();
	}

}
