package com.zoho;

public class ReverseStringWithOutSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i! love: zoho";
		String output = reverseStringWithOutSpaces(str);
		System.out.println("Result" + output);

	}

	public static String reverseStringWithOutSpaces(String input) {
		char[] chinput = input.toCharArray();
		int start = 0, end = input.length() - 1;

		while (start < end) {
			while (start < end && !isCharacter(chinput[start])) {
				start++;
			}
			while (start < end && !isCharacter(chinput[end])) {
				end--;
			}
			if (isCharacter(chinput[start]) && isCharacter(chinput[end])) {
				char temp = chinput[start];
				chinput[start] = chinput[end];
				chinput[end] = temp;
			}
			start++;
			end--;
		}
		return new String(chinput);

	}


	static boolean isCharacter(char ch) {
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			return true;
		}
		return false;
	}

}
