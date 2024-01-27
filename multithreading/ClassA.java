package com.multithreading;

public class ClassA implements Runnable {
	public void run() {
		// code
		for(int i=1;i<=5;i++) {
			System.out.println("Thread is calling");
		}
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		Thread t = new Thread(aobj);
		t.start();
	}
}

