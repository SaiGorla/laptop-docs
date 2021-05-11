package com.sai.collections;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(121);
		al.add(45.36);
		al.add('d');
		al.add("sai");
		al.add(null);
		al.add(121);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.hashCode()); // for every object, the JVM creates unique ID, that unique is nothing but hash code
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.toString());
		System.out.println(al.clone());
		System.out.println(al.set(2, "Java"));
		System.out.println(al);
		System.out.println(al.getClass());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}
}
