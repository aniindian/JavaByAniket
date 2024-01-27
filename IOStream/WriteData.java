package com.IOStream;

import java.io.FileOutputStream;
public class WriteData
{
	/*By this process old data will remove and new data will entered but
	when we want to without removing old data new data will entered.Then 
	add true after "file path".
	*/
	void fileOperation2() throws Exception
	{
		System.out.println("Write the data into a file");
		System.out.println("First need to create method of OutputStream");
		FileOutputStream fos = new FileOutputStream("D:\\NIT\\java core\\file\\writefr.txt");
	//	FileOutputStream fos = new FileOutputStream("D:\\NIT\\java core\\file\\writefr.txt",true);
		String data = "I love Mother";
		byte arr[] = data.getBytes();
		fos.write(arr);
		System.out.println("Data Entered");
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
			WriteData obj=new WriteData();
			obj.fileOperation2();
		
	}
}
