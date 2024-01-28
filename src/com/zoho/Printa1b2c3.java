package com.zoho;
/*input a1b2c3
 * ouput abbcc
 */
public class Printa1b2c3 {
	public static void main(String[] args) {
		/*
		 * char[] ch = new char[s.length()]; for (int i = 0; i < s.length(); i++) {
		 * ch[i] = s.charAt(i); }
		 */
		String str = "a1b2c3";
		printIncrement(str);
	}

	static void printIncrement(String s) {

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int num = 0;
			if (ch[i] > '0' && ch[i] < '9') {
				char temp = ch[i - 1];
				while (i < ch.length && (ch[i] > '0' && ch[i] < '9')) {
					num = (num * 10) + ch[i] - '0';
					i++;
				}
				for (int k = 0; k < num; k++) {
					System.out.print(temp);
				}
			}
		}

	}
}