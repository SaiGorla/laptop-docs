package com.sai.runnable;

public class MyThread implements Runnable  
{
	public void run()
	{
		for(int i = 0; i<100 ; i++)
		{
			System.out.println(" child thread is executing");
		}
	}
}
