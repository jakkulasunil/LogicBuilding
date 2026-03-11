package com.basics.logic;

public class OddorEven {

	public static boolean isEven(int n) {
		int rem = n % 2;
		if (rem == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 14;
		if (isEven(n) == true)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
