package com.sai.string;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("sai rohith gorla");
		System.out.println(sb);
		sb.append("development");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		System.out.println(sb.getClass());
		System.out.println(sb.reverse());
		
	}
}
