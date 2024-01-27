package com.arrays;

public class Task2
{
	boolean meth1(int arr[])
	{
		
	/*	if(arr[0]==2 && arr[1]==2 && arr[0]==3 && arr[1]==3)
		{
			return false;
		}
		else
		{
			return true;
		}
	*/
		
//		    OR
		
		boolean a=true;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=2 || arr[i]!=3)
			{
				a=true;
			}
			else
			{
				a=false;
			}
		}
		return a;
		
		
	}
	public static void main(String[] args)
	{
		Task2 aobj = new Task2();
		int arr1[] = {4,3};
		boolean res = aobj.meth1(arr1);
		System.out.println(res);
	}
}
