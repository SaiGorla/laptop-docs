package com.sai.conditionalstatements;

import java.util.Scanner;

public class EvenOrOdd {

	void validate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int value = sc.nextInt();
		
		if(value % 2 == 0)
		{
			System.out.println("Given value is even");
		}
		else
		{
			System.out.println("Given value is odd");
		}
	}
	
	public static void main(String[] args)
	{
		EvenOrOdd obj = new EvenOrOdd();
		obj.validate();
	}
}
