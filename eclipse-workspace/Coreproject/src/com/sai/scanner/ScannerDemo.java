package com.sai.scanner;

import java.util.Scanner;

public class ScannerDemo 
{
	void calculate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = sc.nextInt();
		System.out.println("enter b value:");
		int b = sc.nextInt();
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		
		System.out.println("a+b value is :"+c);
		System.out.println("a-b value is : "+d);
		System.out.println("a*b value is :"+e);
		System.out.println("a/b value is : "+f);
	}
	
	public static void main(String[] args)
	{
		ScannerDemo sd = new ScannerDemo();
		sd.calculate();
	}
}
