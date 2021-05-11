package com.sai.conditionalstatements;

import java.util.*;

public class Test 
{
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter age :");
		 int age = sc.nextInt();
		 
		 if(age > 18)
		 {
			 System.out.println("given person is eligible to vote");
		 }
		 else
		 {
			 System.out.println("Given pesrson is not eligible to vote");
		 }
		 
	 }
}
