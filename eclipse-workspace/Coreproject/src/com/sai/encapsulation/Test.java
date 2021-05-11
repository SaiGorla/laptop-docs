package com.sai.encapsulation;

public class Test {
	
	public static void main(String[] args)
	{
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("sai");
		employee.setSalary(10000);
		
		System.out.println("employee Id is "+employee.getId());
		System.out.println("employee Name is "+employee.getName());
		System.out.println("employee Salary is "+employee.getSalary());
		
	}

}
