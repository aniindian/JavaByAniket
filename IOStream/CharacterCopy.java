package com.IOStream;

import java.io.FileReader;
import java.io.FileWriter;
public class CharacterCopy {
	void fileOperation() throws Exception
	{
		System.out.println("Coping the data from another file ");
		FileReader fr=new FileReader("D:\\NIT\\java core\\file\\readfr.txt");
		FileWriter fw=new FileWriter("D:\\\\NIT\\java core\\file\\writererfr.txt");
		System.out.println("Connection created");
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write(x);
		}
		System.out.println("Data copied!");
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		CharacterCopy obj=new CharacterCopy();
		obj.fileOperation();
	}
}
