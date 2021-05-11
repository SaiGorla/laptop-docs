package com.sai.loopingstatements;

public class WhileDemo 
{
	public static void main(String[] args)
	{
		int i = 20;
		/*
		 * while(i < 50) { System.out.println(i); i++; }
		 */
		do
		{
			System.out.println("Atleast once the logic need to be executed");
		}
		while(i < 15);
		{
			System.out.println(i);
			i++;
		}
	}
}
