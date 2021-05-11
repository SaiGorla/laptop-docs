package com.sai.synchronization;

public class Test 
{
	public static synchronized void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		
		for(int i=0; i<50; i++)
		{
			System.out.println("main thread is executing !");
		}
	}
}
