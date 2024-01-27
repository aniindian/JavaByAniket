package com.IOStream;

import java.io.FileReader;
public class CharacterReader 
{
	void fileOperation1() throws Exception
	{
		System.out.println("Read the Data by Character Stream ---> Reader");
		FileReader fr=new FileReader("D:\\NIT\\java core\\file\\readfr.txt");
		System.out.println("Conection Create");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data Retrive");
		fr.close();
	}
	public static void main(String[] args) throws Exception
	{
		   CharacterReader obj=new CharacterReader();
		   obj.fileOperation1();
		
	}
}
