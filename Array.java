import java.util.Random;

public class Array {

	public static void main(String[] args) 
	{
		int a[] = {4,8,5,6,55,89,2,75,69};
		for (byte i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		//To change element in Array
		a[2]=10;
		System.out.println("\n------------------------------------------------------------------------------------------------------------");
		for (byte i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		//size of array
		int b = a.length;
		System.out.println("\nlength of Array is: "+b);
		//Random value From java
		int anyValue = a[new Random().nextInt(a.length)];
		System.out.println("Random Value is: "+anyValue);
		//Sort array 
		//Append new item in array
		
		int array1 [] = {23,45,56,87,97,68};
		int array2 [] = {56,34,65,856,865};
		int array3 [] = new int[array1.length+array2.length];
		byte i;
		for ( i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
		}
		for(i=(byte) array1.length;i<array2.length;i++)
		{
			for (byte j=0;j<i;j++)
			{
				array3[i]=array2[j];
			}
		}
		System.out.println(array3);
		for(byte i1 = 0;i1<array3.length;i1++)
		{
			System.out.println(array3[i1]);
		}
	//int [] newArray = As.copyOf(a, a.length + 1);
		//newArray[newArray.length - 1] = newItem;
		//Copy one Array into Another 
		int copy[];
		
		/*for(int i=0;i<a.length;i++)
		{
			copy=System.arraycopy();
		}*/
		
		
	}

}
