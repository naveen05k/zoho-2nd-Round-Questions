package com.zoho;

public class MultiplicationUsingPlus {
	public static void main(String[] args) {
		int a = 3,b=4;
		System.out.println(multiplication(a, b));

	}

	static int multiplication(int a, int b) {
		int result = 0;
		for (int i = 0; i < a; i++) {
			result = result +b;
		}
		return result;
	}
}
///3+3+3+3=12