package com.sai.methodspreventThread;

public class Test  
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t = new MyThread();
		t.start();
		t.join();
		
		for(int i=0; i<50; i++)
		{
			System.out.println("main thread is executing");
		}
	}
}
