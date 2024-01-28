package com.zoho;

import java.util.Scanner;

public class Adding2Number {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of digits for the first number: ");
		int n1 = scanner.nextInt();
		int[] num1 = new int[n1];
		System.out.println("Enter the digits for the first number:");
		for (int i = 0; i < n1; i++) {
			num1[i] = scanner.nextInt();
		}

		// Input for the second number
		System.out.print("Number of digits for the second number: ");
		int n2 = scanner.nextInt();
		int[] num2 = new int[n2];
		System.out.println("Enter the digits for the second number:");
		for (int i = 0; i < n2; i++) {
			num2[i] = scanner.nextInt();
		}

		// Perform addition
		int[] result = calculateSum(num1, num2);

		// Display the result
		System.out.println("Sum:");
		for (int digit : result) {
			System.out.print(digit + " ");
		}
	}

	static int[] calculateSum(int[] num1, int[] num2) {
		int maxLength = Math.max(num1.length, num2.length);
		int[] result = new int[maxLength + 1];
		int carry = 0;

		for (int i = 0; i < maxLength; i++) {
			int d1 = (i < num1.length) ? num1[num1.length - 1 - i] : 0;
			int d2 = (i < num2.length) ? num2[num2.length - 1 - i] : 0;
			int sum = d1 + d2 + carry;
			result[result.length - 1 - i] = sum % 10;
			carry = sum / 10;
		}
		//result[0] = carry;
		return result;
	}
	
}
