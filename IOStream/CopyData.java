package com.IOStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class CopyData {
	
	// It is process of copy data from 1 file to other file
	void FileOperation3() throws Exception
	{
		System.out.println("Copy the data from one file another file");
		FileInputStream fis = new FileInputStream("D:\\NIT\\java core\\file\\readfr.txt");
		FileOutputStream fos = new FileOutputStream("D:\\NIT\\java core\\file\\writefrs.txt");
		System.out.println("Connection created");
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		System.out.println("Data Copy success");
		
	}
	public static void main(String[] args) throws Exception
	{
		CopyData obj=new CopyData();
		obj.FileOperation3();
	}
}
//*** By this process we can copy the image
//** Instanceof :- It is use to chack obj belongs to particualer Class or Not 
