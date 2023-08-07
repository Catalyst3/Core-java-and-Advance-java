package com.aditya;
//Medium Level Question 1: Array Rotation
//Given an array of integers, rotate the elements of the array to the left by a 
//given number of positions k. For example, if k=2, the array [1, 2, 3, 4, 5] should become 
//[3, 4, 5, 1, 2].
public class RotationOfArray {
	public void rotate()
	{
		int [] arr = {1, 2, 3, 4, 5};
		int k=2;
		int [] prvArr;
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			int [] prvArr;
			if(i<k)
			{
				prvArr= new int[i+1];
				prvArr[i] = arr[i];
			}
			int [] aftArr= new int[arr.length-k];
			aftArr[j]=arr[i];
			j++;
			if(i==arr.length-1)
			{
				int[] result = new int[arr.length];
				result=
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
