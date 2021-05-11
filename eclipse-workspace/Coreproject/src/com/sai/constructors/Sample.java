package com.sai.constructors;

public class Sample 
{
	Sample() // default constructor
	{
		System.out.println("Default Constructor");
	}
	
	Sample(int a, int b) // Parameterized Constructor
	{
		this();  // constructor chaining
		int c = a+b;
		System.out.println("a+b value is "+c);
	}
	
	Sample(int a, int b, int c) // Constructor overloading
	{
		this(a,b);
		int d = a+b+c;
		System.out.println("a+b+c value is "+d);
	}
}
