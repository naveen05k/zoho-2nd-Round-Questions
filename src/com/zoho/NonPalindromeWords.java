package com.zoho;

/*Form the input sentence given, find the strings which are not palindrome and print it 
input: he knows malayalam
output: he knows*/
public class NonPalindromeWords {

	public static void main(String[] args) {
		String str = "Text contains malayalam and level words";
		findNonPalindromeWords(str);
	}

	public static void findNonPalindromeWords(String sentence) {
		int start = 0;
		int end = 0;
		int totalLength = sentence.length();
		while (end < totalLength) {
			while (end < totalLength && sentence.charAt(end) != ' ') {
				end++;
			}
			if (!isPalindrome(sentence, start, end - 1)) {
				for (int i = start; i < end; i++) {
					System.out.print(sentence.charAt(i));
				}
				System.out.print(" ");
			}
			start = end + 1;
			end = start;
		}
	}

	static boolean isPalindrome(String str, int start, int end) {

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
