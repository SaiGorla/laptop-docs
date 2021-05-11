package com.sai.exceptionhandling;

import java.util.Scanner;

public class Arthimetic 
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
			System.out.println("you cannot divide by zero");
		}
		finally
		{
			System.out.println(" exception is related and rectified properly");
		}
		
		int c = a/b;
		int d = a+b;
		int e = a-b;
		int f = a*b;
		
		System.out.println("a/b value is :" +c);
		System.out.println("a+b value is :" +d);
		System.out.println("a-b value is :" +e);
		System.out.println("a*b value is :" +f);
	}
	
	public static void main(String[] args)
	{
		Arthimetic ar = new Arthimetic();
		ar.calculate();
		
	}
}
