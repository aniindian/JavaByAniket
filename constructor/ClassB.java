package com.constructor;

public class ClassB {
	
	public ClassB()
	{
		System.out.println("Sunday");
		ClassB bobj = new ClassB(30);
		System.out.println("Tuesday");
		String s=bobj.display("Challange Accepted");
		System.out.println(s);
		
	}
	public ClassB(int temp)
	{
		System.out.println("Saturday");
		new ClassB(10,20);
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the next statement, I am returning String value");
		return s;
	}
	public ClassB(int temp, int data)
	{
		System.out.println("Thursday");
	}
	public static void main(String[] args) 
	{
		ClassB bobj = new ClassB();
		System.out.println("Output Verified");
	}
}
