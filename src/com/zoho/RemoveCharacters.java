package com.zoho;

/*Given tow string s1 and s2 remove all the charecter form s1 which is present in s2.
input: s1 ="expErience",s2="En
output:s1="expriece*/
public class RemoveCharacters {

	public static void main(String[] args) {
		String s1 = "expErience";
		String s2 = "Enx";
		String result = removecharcter(s1, s2);
		System.out.println("Output: " + result);
	}

	static String removecharcter(String s1, String s2) {
		String result = "";
		for (int i = 0; i < s1.length(); i++) {
			char curChar = s1.charAt(i);

			if (s2.indexOf(curChar) == -1) {
				result += curChar;
			}
		}
		return result;

	}
}
