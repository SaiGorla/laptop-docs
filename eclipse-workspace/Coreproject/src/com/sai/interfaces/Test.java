package com.sai.interfaces;

public class Test 
{
  public static void main(String[] args)
  {
	  HdfcBank bank = new HdfcBank();
	  bank.deposit();
	  bank.loan();
	  bank.withdraw();
	  bank.interest();
  }
}
