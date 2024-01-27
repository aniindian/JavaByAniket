package com.exceptionHandling;

import java.util.Scanner;
public class ClassA {
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		System.out.println(10);
		try
		{
			System.out.println("Try block executed");
			System.out.println("Please enter a number");
			System.out.println("===>"+20/sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("Catch block executed");
			System.out.println(e.toString());// It show name of exception
			System.out.println(e.getMessage());// It show why the exception occured
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println(30);
		
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}
}
