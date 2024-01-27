package com.constructor;

public class ClassC {
	int meth1(int a)
	{
		System.out.println(a+10);
		return a-10;
	}
	ClassC(String s)
	{
		System.out.println(s);
	}
	ClassC()
	{
		System.out.println("Non-parameterized conductor");
		new ClassC("Java is awesome");
	}
	public static void main(String[] args) {
		System.out.println(new ClassC().meth1(100)+10);
	}
}
