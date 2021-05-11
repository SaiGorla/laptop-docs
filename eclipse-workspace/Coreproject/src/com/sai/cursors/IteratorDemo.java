package com.sai.cursors;

 
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<100; i++)
		{
			al.add(i);
			
		}
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Integer it = (Integer)itr.next();
		if(it % 2 == 0)
		{
			System.out.println(it);
		}
		else
		{
			itr.remove();
		}
	}
	}
}

