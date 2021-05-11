package com.sai.transferstatements;

public class BreakAndContinueDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {

			/*
			 * if (i == 25) { break; } System.out.println(i);
			 */

			if (i % 2 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
