package com.constructor;

public class ClassA {
	void meth1()
	{
		System.out.println("called meth1");
	}
	ClassA()
	{
		System.out.println("Non-Parameterized");
		new ClassA(100);// Here called parameterized
	}
	ClassA(int a)
	{
		System.out.println("Parameterized Constructor===>" + a);
	}
	public static void main(String[] args) {
		ClassA aobj = new ClassA(); // here called non-parameterized constructor
		aobj.meth1();
	}
}
