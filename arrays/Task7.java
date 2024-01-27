package com.arrays;

public class Task7 
{
	public boolean commonEnd(int []a, int []b)
	{
		if(a.length>=1 && b.length>=1 && a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Task7 aobj = new Task7();
		int num1[] = {1,2,5,2};
		int num2[] = {5,4,6,2};
		boolean result = aobj.commonEnd(num1,num2);
		System.out.println(result);
	}
}
