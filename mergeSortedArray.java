package com.aditya;

import java.util.Arrays;

//Question: Given two sorted arrays of integers, merge them into a single sorted array without using extra space.
//Example Input:
//Array 1: [1, 3, 5, 7]
//Array 2: [2, 4, 6, 8]
//Expected Output: [1, 2, 3, 4, 5, 6, 7, 8]
public class mergeSortedArray {
	public void merge()
	{
		int [] arr1 = {1, 3, 5, 7};
		int [] arr2 = {2, 4, 6, 8};
		int left = arr1.length-1;
		int right=0;
		int i;
		while(left>right)
		{
			int temp=arr1[left];
			arr1[left]=arr2[right];
			arr2[right]=temp;
			left--;
			right++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.print("arr1: ");
	    for (int num : arr1) {
	        System.out.print(num + " ");
	    }
	    System.out.println();

	    // Print the elements of arr2
	    System.out.print("arr2: ");
	    for (int num : arr2) {
	        System.out.print(num + " ");
	    }
	}

	public static void main(String[] args) {
		mergeSortedArray mer =new mergeSortedArray();
		mer.merge();
	}

}
