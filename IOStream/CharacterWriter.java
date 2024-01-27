package com.IOStream;

import java.io.FileWriter;
public class CharacterWriter {
	void fileOperation() throws Exception
	{
		System.out.println("Write the data into");
		FileWriter fw=new FileWriter("D:\\\\NIT\\java core\\file\\writererfr.txt",true); 
		System.out.println("Connection contected");
		String data = ",because java have best feature that is Garbage collector";
		fw.write(data);
		System.out.println("Data Entered");
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		CharacterWriter obj=new CharacterWriter();
		obj.fileOperation();
	}
}
