package com.sai.loopingstatements;

public class ForDemo1 
{
	public static void main(String[] args)
	{
		int a[] = {12,15,16,18,20,22,28,30,34,38};
		
		/*
		 * System.out.println(a[0]); 
		 * System.out.println(a[1]); 
		 * System.out.println(a[2]);
		 * System.out.println(a[3]); 
		 * System.out.println(a[4]);
		 */
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
