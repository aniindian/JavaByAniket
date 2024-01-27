/* Q: Given an int array length 3, if there is 2 in the array immediately
 *  followed by a 3, change the element 3 to 0, and return the change array.
 *  123 --> 120
 *  234 --> 204
 *  122 --> 122
 *  
 */

package com.arrays;

import java.util.Scanner;

public class Task1
{
	Scanner sc = new Scanner(System.in);
	int[] meth1()
	{
//		System.out.print("Enter your size:");
//		int size = sc.nextInt();
		int arr[] = {2,3,3};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2 && arr[i+1]==3)
			{
				arr[i+1]=0;

			}

		}

		return arr;		
	}
	public static void main(String[] args) 
	{
		Task1 aobj = new Task1();
		int result[] = aobj.meth1();
/*		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
*/
//		   OR
		
		for(int x:result)
		{
			System.out.print(x+" ");
		}
	}
	
}
