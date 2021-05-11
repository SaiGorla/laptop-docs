package com.sai.methodspreventThread;

public class SleepDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Java is a ");
		Thread.sleep(3000);
		System.out.println("object");
		Thread.sleep(3000);
		System.out.println("oriented");
		Thread.sleep(3000);
		System.out.println("programming language");
	}
}
