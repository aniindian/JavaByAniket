package com.multithreading;

public class ClassF 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("J");
		Thread.sleep(1000);  // Static method called by the help of className
		System.out.println("a");
		Thread.sleep(1000);
		System.out.println("v");
		Thread.sleep(1000);
		System.out.println("a");
	}
	
}
