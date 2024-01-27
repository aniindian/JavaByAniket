package com.multithreading;

public class Dead_Lock {
	public static void main(String[] args)
	{
		final String A = "Java";
		final String B = " Python";
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized(A) //java
				{
					System.out.println("Thread 1 locked on A");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)//python
					{
						System.out.println("Thread 1 locked on B");
					}
					System.out.println("No dead lock");
				}
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				synchronized(B)//python
				{
					System.out.println("Thread 2 locked on B");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(A)//java
					{
						System.out.println("Thread 2 locked on A");
					}
					System.out.println("No dead lock");
				}
			}
		};
		t1.start();
		t2.start();
		
	}
}
