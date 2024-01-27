package com.IOStream;

import java.io.FileInputStream;

public class ReadData 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading the data from file using ByteStreams");
		System.out.println("We need to create object of FileInputStream");
		FileInputStream fis = new FileInputStream("D:\\NIT\\java core\\file\\readfr.txt");
		System.out.println("-------Connection Created------");
		
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);// Here I'm using char for typeCasting b/s read() will return int so,i'm using typeCasting to convert int to char
			
		}
		System.out.println();
		System.out.println("Data retrived");
		fis.close();
	}
	void rbg()
	{
		System.out.println("Hiiii");
	}
	ReadData() throws Exception
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) throws Exception
	{
		ReadData aobj= new ReadData();
		aobj.FileOperation1();
		
	}
}
