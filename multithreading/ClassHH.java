package com.multithreading;

public class ClassHH 
{
	public static void main(String[] args)
	{
		ClassH hobj	= new ClassH();
		hobj.start();
		for(int i=1;i<=5;i++)
		{
			Thread.yield();
			System.out.println("ClassHH==>"+i);
		}
	}
}
