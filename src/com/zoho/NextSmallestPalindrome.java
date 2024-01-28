package com.zoho;

/*Given a number find next smallest palinfrome in java */
public class NextSmallestPalindrome {

	public static void main(String[] args) {
		long num = 12345;

		while (isPalindrome(num) == 0) {
			num = num + 1;
		}
		System.out.println(num);
	}

	static int isPalindrome(long num) {
		long original = num;
		long rev =0;
		while(num > 0) {
			long digit = num % 10;
			rev = rev * 10 + digit;
			num = num /10;
		}
		if (original == rev) {
			return 1;
		} else {
			return 0;
		}
	}

}
