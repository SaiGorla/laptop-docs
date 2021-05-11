package com.sai.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
		//HashMap<Integer, String> hm = new HashMap<>();   
		
		//LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		
		TreeMap<Integer, String> hm = new TreeMap<>();
		
		
		hm.put(45, "siva");
		hm.put(12, "sai");
		hm.put(120, "ravi");
		hm.put(55, "koushik");
		hm.put(23, null);
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.toString());
		System.out.println(hm.hashCode());
		System.out.println(hm.get(15));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(34));
		System.out.println(hm.containsValue(12));
		System.out.println(hm.getClass());
		hm.remove(23);
		System.out.println(hm.size());
		System.out.println(hm.toString());
		System.out.println(hm.isEmpty());
		
	}
}
