package com.sai.conditionalstatements;

import java.util.Scanner;

public class SwitchDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		
		System.out.println(" perform the arthimetic operations \n 1.add \n 2.sub \n 3.mul \n 4.div");
		
		int condition = sc.nextInt();
		switch (condition) {
		case 1:
			System.out.println("a+b value is :"+(a+b));
			break;
		case 2:
			System.out.println("a-b value is :"+(a-b));
			break;
		case 3:
			System.out.println("a*b value is :"+(a*b));
			break;
		case 4:
			System.out.println("a/b value is :"+(a/b));
			break;
			
		default:
			System.out.println("Invalid condition");
			break;
			
		}
	}
}
