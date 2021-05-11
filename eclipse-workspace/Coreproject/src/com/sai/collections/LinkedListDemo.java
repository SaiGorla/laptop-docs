package com.sai.collections;

import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args)
	{
		LinkedList al = new LinkedList();
		al.add(121);
		al.add(78.99);
		al.add("d");
		al.add("madhu");
		al.add(null);
		al.add(121);
		System.out.println(al);
		al.addFirst(789);
		al.addLast(32.56);
		System.out.println(al);
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		al.removeFirst();
		al.removeLast();
		System.out.println(al.toString());
		System.out.println(al.size());
		System.out.println(al.hashCode());
		System.out.println(al.isEmpty());
		System.out.println(al.getClass());
		System.out.println(al.clone());
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}
}
