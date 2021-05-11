package com.sai.runnable;

public class Test 
{
	public static void main(String[] args) {
	
	
	MyThread t = new MyThread();
	//t.start();
	Thread t1 = new Thread(t);
	t1.start();
	for(int i=0; i<100; i++)
	{
		System.out.println("main thread is executed");
	}
	
	
	}	
	
}
