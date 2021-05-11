package com.sai.accessmodifiers;

 

public class Sample1 
{
   public int a = 12;
   
   public void show()
   {
	   System.out.println("private data cannot be accessed outside the class");
   }
   
   public static void main(String[] args)
   {
	   Sample1 sample1 = new Sample1();
	   System.out.println("a value is :"+sample1.a);
	   sample1.show();
	   
   }
}
