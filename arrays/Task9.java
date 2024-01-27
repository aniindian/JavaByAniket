package com.arrays;

public class Task9 
{
	public int meth1(int[] nums)
	{
		int temp = 0;
		for(int i=0;i<nums.length-1;i++)
		{
			System.out.println(i + " and " + nums[i]);
			System.out.println(i+1 + " and(i+1) " + nums[i+1]);
			System.out.println("----------------------");

			if(nums[i]!=nums[i+1])
			{
				System.out.println("nums[temp]:"+ nums[temp]);
				System.out.println("----------------------");
				nums[temp]=nums[i+1];
				System.out.println("2nd nums[temp]:"+ nums[temp]);
				System.out.println("----------------------");
				temp++;
				System.out.println("temp:"+temp);
			}
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Task9 tobj = new Task9();
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int result = tobj.meth1(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(result);
		
	}


}
