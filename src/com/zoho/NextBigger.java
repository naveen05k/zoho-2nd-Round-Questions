package com.zoho;

public class NextBigger {

	public static void main(String[] args) {
		int[] inputArray = { 8, 1, 4, 6, 9, 5 };
		nextGreater(inputArray);

	}

//normal method
	static void nextGreater(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int next = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					next = arr[j];
					break;
				}
			}
			System.out.print(arr[i] + "->" + next + ",");
		}
	}

//using stack
	static void nextBigger(int arr[]) {

	}

}
