package Abstration;
abstract class Car
{
	int carId;
	char Name;
	char brand;
	Car(int carId,char Name,char brand)
	{
		this.carId=carId;
		this.Name=Name;
		this.brand=brand;
	}
	abstract void start();
	abstract void stop();
	abstract void acc();
}
class Suv extends Car
{
	Suv(int carId,char Name,char brand)
	{
		super(carId,Name,brand);
		System.out.println("CarId"+carId);
		System.out.println("Car name"+Name);
		System.out.println("Car brand"+brand);
	}
	void start()
	{
		System.out.println("Engine Stared ");
	}
	void stop()
	{
		System.out.println("Engine Stoped ");
	}
	void acc()
	{
		System.out.println("Engine Started to accelerating ");
	}
}
class Sedan extends Car
{

	Sedan(int carId, char Name, char brand) 
	{
		super(carId, Name, brand);
		System.out.println("CarId"+carId);
		System.out.println("Car name"+Name);
		System.out.println("Car brand"+brand);
	}
	void start()
	{
		System.out.println("Engine Stared ");
	}
	void stop()
	{
		System.out.println("Engine Stoped ");
	}
	void acc()
	{
		System.out.println("Engine Started to accelerating ");
	}
}
class Main
{
	public static void main(String args[])
	{
		 Car suv = new Suv(1202,'E','H');
		 suv.start();
		 suv.stop();
		 suv.acc();
		 System.out.println();
		 Car sedan = new Sedan(1256,'m','s');
		 sedan.start();
		 sedan.stop();
		 sedan.acc();
	}
}
