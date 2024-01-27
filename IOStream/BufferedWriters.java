package com.IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriters 
{
	void bufferedOperation() throws Exception
	{
		System.out.println("Writting the data into a file by using BufferCharacterStream");
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\NIT\\java core\\file\\bufferfl.txt",true));
		System.out.println("Connection created");
		String data=",Because java is a platform independent language";
		bw.write(data);
		System.out.println("Data Entered");
		bw.close();
	}
	public static void main(String[] args) throws Exception
	{
		BufferedWriters obj=new BufferedWriters();
		obj.bufferedOperation();
	}
}
