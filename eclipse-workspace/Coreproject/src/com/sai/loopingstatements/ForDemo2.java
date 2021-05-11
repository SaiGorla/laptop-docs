package com.sai.loopingstatements;

public class ForDemo2 
{
	public static void main(String[] args)
	{
		int a[] = {12, 15, 16, 18,20,22,28,20,34,38};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
				System.out.println(a[i]);
				}
			}
		}
	}
}
