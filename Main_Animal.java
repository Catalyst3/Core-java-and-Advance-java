package Abstration;

abstract class Animal
{
	void sleep(int a)
	{
		System.out.println(a+"Animal is Sleeping");
	}
	abstract void makeSound();
}
class Dog extends Animal
{
	void makeSound()
	
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Meow meow");
	}
}
class Lion extends Animal
{
	void makeSound()
	{
		System.out.println("Roars");
	}
}
public class Main_Animal 
{
	public static void main(String args[])
	{
		Animal cat = new Cat();
		cat.makeSound();
		cat.sleep(5);
		Animal lion = new Lion();
		lion.makeSound();
		lion.sleep(9);
		Animal dog = new Dog();
		dog.makeSound();
		dog.sleep(10);
	}
}
