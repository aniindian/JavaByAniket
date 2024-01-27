package com.arrays;

public class Task6
{
	public int[] makePi()
	{
		int arr[] = {3,1,4};
		return arr;
	}
	public static void main(String[] args)
	{
		Task6 aobj = new Task6();
		int result [] = aobj.makePi();
		for(int x:result)
		{
			System.out.println(x);
		}
	}
	
}
