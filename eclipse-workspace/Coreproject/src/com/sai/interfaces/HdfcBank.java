package com.sai.interfaces;

public class HdfcBank implements Bank
{

	 
	public void deposit() {
		 
		System.out.println("Deposit upto 10 lakhs");
	}

	 
	public void withdraw() {
	 
		System.out.println("withdraw upto 8 lakhs");
	}

	 
	public void loan() {
		System.out.println("you can take loan upto 15 lakhs");
		
	}

	public void interest() {
		System.out.println("interest upto 2% per annum");
	}
}
