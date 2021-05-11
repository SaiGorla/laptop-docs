package com.sai.synchronization;

public class MyThread extends Thread
{
	public synchronized void run()
	{
		for(int i=0; i<50; i++)
		{
			System.out.println("child thread is executing");
		}
	}
}
