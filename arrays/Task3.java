package com.arrays;

public class Task3
{
	int meth1(int arr[])
	{
	
		if(arr.length>=2)
			return arr[0]+arr[1];
		
		else if(arr.length==1)
			return arr[0];
		
		else
			return 0;
		
	}
	public static void main(String[] args) 
	{
		Task3 aobj = new Task3();
		int arr1[] = {10,20,30};
		int result = aobj.meth1(arr1);
		System.out.println(result);
	}
	

}
