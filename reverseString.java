package com.aditya;

public class reverseString {
	public void reverse()
	{
		String s = "hello";
		char [] arr =s.toCharArray();
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;	
			right--;
		}
		System.out.print(arr);
	}

	public static void main(String args[])
	{
		reverseString reverse =new reverseString();
		reverse.reverse();
	}
}
