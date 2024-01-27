package com.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaders 
{
	void bufferedOperation() throws Exception
	{
		System.out.println("Reading the data by BufferedCharacterStream");
		BufferedReader br=new BufferedReader(new FileReader("D:\\NIT\\java core\\file\\readfr.txt"));
		System.out.println("Connection created");
		int x;
		while((x=br.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data Retrived");
		br.close();
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReaders obj=new BufferedReaders();
		obj.bufferedOperation();
	}
}
