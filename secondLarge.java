package com.aditya;
//Question: Given an array of integers, find the second largest element in the array.
//Example Input: [5, 3, 8, 1, 9, 2, 4, 7, 6]
//Expected Output: 8
public class secondLarge {
	public void secLargest()
	{
		int [] input= {5, 3, 8, 1, 9, 2, 4, 7, 6};
		int larg = 0;
		int secondlarg=0;
		for(int i =0; i<input.length;i++)	
		{
			if(input[i]>larg)
			{
				secondlarg=larg;
				larg=input[i];
			}
		}
		System.out.println("Largest is: "+larg);
		System.out.println("Second Largest is: "+secondlarg);
	}
	public static void main(String[] args) 
	{
		secondLarge sec = new secondLarge();
		sec.secLargest();
	}

}
