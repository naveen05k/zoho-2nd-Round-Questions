package com.zoho;
/*
Given an odd length word which should be printed from the middle of the word.

Example:

Input: PROGRAM
The output should be in the following pattern:
	            G
            GR
          GRA
       GRAM
     GRAMP
   GRAMPR
GRAMPRO

*/

public class MiddleWordPattern {

	public static void main(String[] args) {

		String str = "PROGRAM";
		printMiddleWordPattern(str);
	}

	static void printMiddleWordPattern(String str) {
		int mid = str.length() / 2;

		for (int i = 0; i <= mid; i++) {
			for (int j = mid - i; j <= mid + i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

	}
}
