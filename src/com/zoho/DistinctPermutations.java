package com.zoho;

/* Print all distinct permutations of a given string with duplicate character */
public class DistinctPermutations {

	public static void main(String[] args) {
		String str = "aab";
		char[] chaArray = str.toCharArray();
		generatePermutation(chaArray, 0);

	}

	static void generatePermutation(char[] chaArr, int index) {
		if (index == chaArr.length - 1) {
			System.out.println(chaArr);
		} else {
			for (int i = index; i < chaArr.length; i++) {
				if (!containsDuplicate(chaArr, index, i)) {
					swap(chaArr, index, i);
					generatePermutation(chaArr, index + 1);
					swap(chaArr, index, i);
				}
			}
		}

	}

	private static boolean containsDuplicate(char[] charArray, int start, int end) {
		for (int i = start; i < end; i++) {
			if (charArray[i] == charArray[end]) {
				return true;
			}
		}
		return false;
	}

	private static void swap(char[] charArray, int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}
}
