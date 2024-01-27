package com.multithreading;

public class ClassB extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Using extends with thread class");
		}
	}
	public static void main(String[] args) {
		ClassB bobj=new ClassB();
		Thread t1 = new Thread(bobj);
		bobj.run();
	}
}
