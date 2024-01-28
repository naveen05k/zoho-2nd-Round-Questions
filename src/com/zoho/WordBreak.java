package com.zoho;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.
Example 1:
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".*/
public class WordBreak {
	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice",
				"cream", "icecream", "man", "go", "mango"));
		String input = "ilike";

		boolean result = WordSegmentation(input, dictionary);

		if (result) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	static boolean WordSegmentation(String input, Set<String> dictionary) {
		boolean[] dp = new boolean[input.length() + 1];
		dp[0] = true;
		for (int i = 0; i <= input.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && dictionary.contains(input.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[input.length()];
	}
}
