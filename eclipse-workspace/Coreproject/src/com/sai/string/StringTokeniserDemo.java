package com.sai.string;

import java.util.StringTokenizer;

public class StringTokeniserDemo 
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("java is a object orienterd programming language");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
