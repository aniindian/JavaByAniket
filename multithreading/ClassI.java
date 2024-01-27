package com.multithreading;
//concept of synchronized 
public class ClassI extends Thread
{
	public void run()
	{
		resource();
	}
	synchronized void resource()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+"has entered the resource==>"+i);
		}
		System.out.println(name +" has exited");
	}
	public static void main(String[] args) 
	{
		ClassI iobj = new ClassI();
		Thread t1 = new Thread(iobj);
		Thread t2 = new Thread(iobj);
		
		t1.setName("First_Thread");
		t2.setName("Second_Thread");
		
		t1.start();
		t2.start();
		
	}
}
