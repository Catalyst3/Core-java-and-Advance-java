package com.aditya;
//Question 1: Replace All Occurrences
//Given an array of integers and two integers, old_val and new_val, replace all occurrences of old_val with new_val in the array.
//
//Example:
//Input:
//Array: [4, 2, 1, 2, 5, 2]
//old_val: 2
//new_val: 9
//
//Output:
//Modified Array: [4, 9, 1, 9, 5, 9]
public class replaceOldOccurance {
	public void replace()
	{
		 int [] arr= {4, 9, 1, 9, 5, 9};
		 int old_val=2;
		 int new_val=9;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==old_val)
			 {
				 arr[i]=new_val;
			 }
			 System.out.print(arr[i]+",");
		 }	 
	}
	public static void main (String args[])
	{
		replaceOldOccurance re =new replaceOldOccurance();
		re.replace();
	}

}
