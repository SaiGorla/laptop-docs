package com.sai.multithreading;

public class MyThread extends Thread 
{
	 public void run()
	 {
		 for(int i=0; i<100 ; i++)
		 {
			 System.out.println("child thread is executing");
		 }
	 }
	 
	 public void start()
	 {
		 for(int i=0; i<100 ; i++)
		 {
			 System.out.println("main  thread is executing");
		 }
	 }
}
