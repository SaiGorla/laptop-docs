package com.sai.methodoverloading;

public class Sample1
{

	void add() 
	{
		System.out.println("here is an example of method overloading");
	}
	
	void add(int a, int b) 
	{
		int c = a+b;
		System.out.println("value of c is:"+c);
	}
	
	void add(int a, int b, int c) 
	{
		int d = a+b+c;
		System.out.println("value of d is:"+d);
	}
	
	void add(float a, float b) 
	
	{
		float c = a+b;
		System.out.println("addition of decimal values is:"+c);
	}
}
