package com.sai.methodspreventThread;

public class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			//Thread.yield();
			System.out.println("child thread is executing");
		}
	}
}
