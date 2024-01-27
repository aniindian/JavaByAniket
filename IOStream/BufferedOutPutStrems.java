package com.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
		//	OR
//import java.io.*;
public class BufferedOutPutStrems 
{
	void bufferedOperation() throws Exception
	{
		System.out.println("Write the data into file by the help of BufferedByteStream");
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\NIT\\java core\\file\\bufferfl.txt"));
		System.out.println("Coonection Created");
		String data = "Java is awesome!!!";
		byte arr[]=data.getBytes();
		bos.write(arr);
		System.out.println("Data Entered");
		bos.close();
	}
	public static void main(String[] args) throws Exception
	{
		BufferedOutPutStrems  obj=new BufferedOutPutStrems ();
		obj.bufferedOperation();
		
	}
}
