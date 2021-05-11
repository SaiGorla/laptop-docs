package com.sai.abstractclass;

public class Test 
{
	public static void main(String[] args)
	{
		/* Bank b = new Bank(); */
		HdfcBank bank = new HdfcBank();
		bank.deposit();
		bank.interest();
		bank.loan();
		bank.withdraw();
	}
}
