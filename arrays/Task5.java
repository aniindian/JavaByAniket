// If first and last element are same and length of array is 1 or more then return true

package com.arrays;

public class Task5 
{
	public boolean sameFirstLast(int []nums)
	{
		if(nums.length>=1 && nums[0]==nums[nums.length-1])
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Task5 aobj = new Task5();
		int [] num = {1,2,3,2};
		boolean result = aobj.sameFirstLast(num);
		System.out.println(result);
	}
}
