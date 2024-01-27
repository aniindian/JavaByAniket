package com.multithreading;

public class ClassD extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("ClassD===>"+i);
		}
	}
}
