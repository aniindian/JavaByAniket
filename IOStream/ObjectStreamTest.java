package com.IOStream;

import java.io.Serializable;
public class ObjectStreamTest implements Serializable
{
	transient String a = "I love You";
	 int b = 1500;
}
