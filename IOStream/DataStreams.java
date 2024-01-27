package com.IOStream;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class DataStreams 
{
	void fileOperation() throws Exception
	{	// DataOutputStream 
		System.out.println("---Writting the data into a file by using DataStream---");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\NIT\\java core\\file\\DataStream.txt"));
		dos.writeInt(500);
		dos.writeChar('A');
		dos.writeInt(50000);
		dos.writeBoolean(true);
		System.out.println("Data Entered");
		dos.close();
		System.out.println("------------First Enter Data then Read Data---------------");
		//DataInputStream
		System.out.println("---Reading the data by using DataStream Concept--- ");
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\NIT\\java core\\file\\DataStream.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println("Data Retrived!");
		dis.close();
		
	}
	public static void main(String[] args) throws Exception
	{
		DataStreams obj=new DataStreams();
		obj.fileOperation();
	}
}
