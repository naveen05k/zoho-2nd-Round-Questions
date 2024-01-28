package com.zoho;

public class NumberPattern {
	public static void main(String[] args) {
		int n = 4; // Change this value to adjust the size of the pattern
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// Print leading spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print decreasing numbers
			int num = i * (i + 1) / 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num--;
			}

			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			// Print leading spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print decreasing numbers
			int num = i * (i + 1) / 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num--;
			}

			System.out.println();
		}
	}
}
