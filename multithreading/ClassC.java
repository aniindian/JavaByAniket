package com.multithreading;

public class ClassC extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println(Thread.currentThread().getState());//to get the life cycle stage of thread
		for(int i=1;i<=5;i++) {
			System.out.println(name+"("+priority+")"+"Thread Class will be excuted");
		}
	}
	public static void main(String[] args) {
		ClassC cobj=new ClassC();
		Thread t1=new Thread(cobj);
		Thread t2 = new Thread(cobj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(MIN_PRIORITY);// Giving the priority of thread
		t2.setPriority(10); //Giving the priority of thread
		
		
		
		
		t1.start(); // A new thread will be created which is responsible for running the ClassC run()
		
		t1.run();// no new thread will be created, directly ClassC run() will be executed [because we are overriding Thread class run()]
	}
}
