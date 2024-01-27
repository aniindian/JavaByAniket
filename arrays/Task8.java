package com.arrays;

public class Task8 
{
	public int[] maxEnd3(int nums[])
	{
/*		
	if(nums[0]>=nums[1])
		{
			if(nums[0]>=nums[2])
			{
				nums[1]=nums[0];
				nums[2]=nums[0];
			}
			else
			{
				nums[0]=nums[2];
				nums[1]=nums[2];
			}
		}
		else if(nums[1]>=nums[2])
		{
			
				nums[0]=nums[1];
				nums[2]=nums[1];
			
		}
		else
		{
			nums[1]=nums[2];
			nums[0]=nums[2];
		}
	*/
//						OR
		
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]>max)
			{
				max=nums[i];
			}
			
		}
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=max;
		}
//		
		return nums;
	}
	public static void main(String[] args)
	{
		Task8 aobj = new Task8();
		int []input = {11,5,3};
		int [] result= aobj.maxEnd3(input);
		
		for(int x:result)
		{
			System.out.print(x+" ");
		}
	}
}
