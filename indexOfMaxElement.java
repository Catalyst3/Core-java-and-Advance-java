package com.aditya;
//Question 2: Maximum Element Index
//Given an array of integers, find the index of the maximum element in the array.
//
//Example:
//Input:
//Array: [15, 7, 22, 13, 9]
//
//Output:
//Index of the maximum element: 2 (since 22 is the maximum element and its index is 2)
public class indexOfMaxElement {
	public void findMaxEleIndex()
	{
		int [] arr = {15, 7, 22, 13, 9};
		int largest=0;
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
				index=i;
			}
			
		}
		System.out.println("Largest is "+largest);
		System.out.println("Index is "+index);
	}
	public static void main(String args[]) 
	{
		indexOfMaxElement max= new indexOfMaxElement();
		max.findMaxEleIndex();
	}

}
