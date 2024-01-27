package com.exceptionHandling;

import java.io.FileReader;
public class Throw_Throws {
	int avl_amt = 10000;
	void account(int wd_amt)
	{
		if(wd_amt>avl_amt)
		{
			throw new RuntimeException("Balance is Not Sufficent");
			
		}
		else
		{
			System.out.println("Transition success");
		}
	}
	void diaplay() throws Exception
	{
		FileReader fr=new FileReader("D:\\NIT\\java core\\file");
		System.out.println("Hello World");
	}
	public static void main(String[] args) throws Exception
	{
		Throw_Throws tobj =new Throw_Throws();
		tobj.account(5000);
		System.out.println("---------------");
		tobj.diaplay();
	}
}
