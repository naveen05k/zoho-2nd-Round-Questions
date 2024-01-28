package com.zoho;

/* print a given string in  fromat */
public class PrintXformat {
	public static void main(String[] args) {
		String str = "12345";
		printFormat(str);

	}

	static void printFormat(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == j || j == str.length() - i - 1) {
					System.out.print(str.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
