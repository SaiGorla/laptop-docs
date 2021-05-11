package com.sai.abstractclass;

public class HdfcBank extends Bank {

	@Override
	void loan() {
		 System.out.println("you can take loan upto 3 lakhs");
		
	}

	@Override
	void interest() {
		 System.out.println("interest is 2% per annum");
		
	}

}
