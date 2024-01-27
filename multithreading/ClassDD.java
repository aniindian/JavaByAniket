package com.multithreading;

public class ClassDD {
	public static void main(String[] args) throws InterruptedException
	{
		ClassD fobj = new ClassD();
		fobj.start();
		fobj.join();
		for(int i=1;i<=5;i++) {
			System.out.println("ClassF===>"+i);
		}
	}
}
