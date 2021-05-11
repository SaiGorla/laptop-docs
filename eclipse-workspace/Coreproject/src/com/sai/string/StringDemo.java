package com.sai.string;

public class StringDemo 
{
	public static void main(String[] args)
	{
		String name = new String("sai");
		System.out.println(name);
		name.concat("rohith");
		System.out.println(name);
		String name1 = new String("rohith");
		System.out.println(name1);
		System.out.println(name1.length());
		System.out.println(name1.getClass());
		System.out.println(name1.hashCode());
		System.out.println(name1.isEmpty());
		System.out.println(name1);
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toCharArray());
		System.out.println(name1.equalsIgnoreCase(name1));
		
	}
}
