package com.arrays;

import java.util.Scanner;

public class ClassA 
{
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		
		System.out.println("There are four way to create array");
		
//		1st way
		int [] arr;
		arr = new int[5];
		
//		2nd way
		int[]arr2 = new int[5];
		
//		3rd way
		int []arr3 = new int [] {10,20,30,40};
		
//		4th way
		int []arr4 = {20,30,40,50,60};
		
		
		
	}
	void meth2()
	{
		
		System.out.println("Enter size your data");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter your data:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Data enter successful");
		
		System.out.println("If you want to chack enter data then press 1");
		int chack = sc.nextInt();
		
		if(chack==1)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
		else
		{
			System.out.println("You pressed wrong key! Please read carefully");
		}
	}
	void meth3()
	{
		int arr[] = new int[5];
		
		for(int x:arr)
		{
			x = sc.nextInt();
			System.out.println(x);
		}

	}
	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		aobj.meth3();
	}
}
