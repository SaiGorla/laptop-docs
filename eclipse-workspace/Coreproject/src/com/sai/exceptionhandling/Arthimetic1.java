package com.sai.exceptionhandling;

import java.util.Scanner;

public class Arthimetic1 
{
	void calculate() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		
		
		try
		{
			int c = a/b;
			System.out.println("a/b value is : "+c);
		}
		catch (Exception e)
		{
			//System.out.println("you cannot divide by zero");
			//e.printStackTrace(); // exception message and line number of the exception
			//System.out.println(e); // exception name and exception message
			System.out.println(e.getMessage()); //exception message
		}
		 
		
		 
		int d = a+b;
		int e = a-b;
		int f = a*b;
		
		//System.out.println("a/b value is :" +c);
		System.out.println("a+b value is :" +d);
		System.out.println("a-b value is :" +e);
		System.out.println("a*b value is :" +f);
	}
	
	public static void main(String[] args)
	{
		Arthimetic1 ar = new Arthimetic1();
		ar.calculate();
		
	}
}
