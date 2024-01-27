package com.IOStream;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
// Both(ObjectStreamTest and ObjectStream) are in same package so we no need to import for other class
public class ObjectStreams 
{
	public static void main(String[] args) throws Exception
	{
		ObjectStreamTest obj1=new ObjectStreamTest();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\NIT\\java core\\file\\ObjectStreamData.ser"));
		System.out.println("Connection Created");
		System.out.println("Serializable Start");
		oos.writeObject(obj1);
		System.out.println("Serializalbe Completed");
		oos.close();
		
		System.out.println("-------------------------------------");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\NIT\\java core\\file\\ObjectStreamData.ser"));
		System.out.println("De-serializable started");
		ObjectStreamTest obj2 = (ObjectStreamTest)ois.readObject();
		
		System.out.println(obj2.a + " and "+obj2.b);
		ois.close();
	}
}
	
