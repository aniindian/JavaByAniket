package com.arrays;

public class Task4 
{
	public boolean firstLast6(int []nums)
	{
/*		if(nums[0]==6 || nums[nums.length-1]==6)
			return true;
		return false;
*/		
//		OR
		if(nums[0]==6 || nums[nums.length-1]==6)
			return true;
		else
		return false;
		
	}
	public static void main(String[] args) 
	{
		Task4 aobj = new Task4();
		int num[] = {6,4,5,5};
		boolean result = aobj.firstLast6(num);
		System.out.println(result);
	}
}
