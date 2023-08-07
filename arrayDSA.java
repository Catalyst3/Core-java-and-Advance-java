package com.aditya;

import java.util.Scanner;

public class arrayDSA {
	Scanner sc = new Scanner(System.in);
	public void userIP()
	{
		int [] marks = new int[10];
		for(int i = 0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
//		to print Array
		for(int i = 0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}
	
	public static void main(String args[])
	{
		arrayDSA arr = new arrayDSA();
		arr.userIP();
	}

}
