package com.IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreams 
{
	void bufferedOpearation() throws Exception
	{
		System.out.println("Read the data from file by using BufferedByteStream");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\NIT\\java core\\file\\readfr.txt"));
		System.out.println("Connection created");
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data Retived");
		bis.close();
	}
	public static void main(String[] args) throws Exception
	{
		BufferedInputStreams obj=new BufferedInputStreams();
		obj.bufferedOpearation();
	}

}
