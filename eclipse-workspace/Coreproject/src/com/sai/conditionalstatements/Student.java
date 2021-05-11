package com.sai.conditionalstatements;

import java.util.*;
public class Student 
{
	void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m1 marks :");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 marks :");
		int m2 = sc.nextInt();
		System.out.println("Enter m3 marks :");
		int m3 = sc.nextInt();
		System.out.println("Enter m4 marks :");
		int m4 = sc.nextInt();
		System.out.println("Enter m5 marks :");
		int m5 = sc.nextInt();
		System.out.println("Enter m6 marks :");
		int m6 = sc.nextInt();
		
		int total = m1+m2+m3+m4+m5+m6;
		float avg = total/6;
		
		System.out.println("Total marks :"+total);
		System.out.println("Average :"+avg);
		
		if(avg > 80)
		{
			System.out.println("Distinction");
		}
		else if (avg >= 60 && avg <= 80)
		{
			System.out.println("A Grade");
		}
		else if (avg >= 45 && avg <= 60)
		{
			System.out.println("B Grade");
		}
		else if (avg >= 35 && avg <= 40)
		{
			System.out.println("C Grade");
		}
		else if (avg < 35)
		{
			System.out.println("Not Qualified");
		}
		}
	
	public static void main(String[] args)
	{
		Student sdt = new Student();
		sdt.calculate();
	}
	
}
