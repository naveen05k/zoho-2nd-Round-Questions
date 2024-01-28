package com.zoho;

public class EaseTheArray {
	public static void main(String[] args) {
		int[] arr = { 0, 2, 2, 2, 0, 6, 6, 0, 8,8,8 };
		processArray(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	static void processArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != 0 && arr[i] == arr[i + 1]) {
				arr[i] = 2*arr[i];
				arr[i + 1] = 0;
				i++;
			}
		}
		moveZero(arr);
	}

	static void moveZero(int arr[]) {
		int nonZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[nonZero] = arr[i];
				nonZero++;
			}
		}
			for (int j = nonZero; j < arr.length; j++) {
				arr[j] = 0;
			}
	}
}
