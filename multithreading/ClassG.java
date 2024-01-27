package com.multithreading;

public class ClassG extends Thread
{
	public void run()
	{
		System.out.println("I am ready to go to interviews");
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is my "+"interview"+i);
		}
		System.out.println("I got placed now i am doing relax");
		try 
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println("My sleep got disturbed");
		}
		System.out.println("It's time to go to office");
	}
	public static void main(String[] args) 
	{
		ClassG gobj = new ClassG();
		Thread obj = new Thread(gobj);
		obj.start();
		obj.interrupt(); //It is used for bring back the sleeping thread to running thread
		
	}
}
