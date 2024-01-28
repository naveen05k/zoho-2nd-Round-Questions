package com.zoho;

public class ReplaceWithGreatestOnRight {

	public static void main(String[] args) {

		int arr[] = {16,17,4,3,5,2 };
		replaceWithGreatest(arr);

		System.out.println(arr);
		printarray(arr);
	}

	static void replaceWithGreatest(int arr[]) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int n = arr.length;
		int maxRight = arr[n - 1];
		arr[n - 1] = -1;
		for (int i = n - 2; i >= 0; i--) {
			int current = arr[i];
			arr[i] = maxRight;
			if (maxRight < current) {
				maxRight = current;
			}
		}
	}

	static void printarray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
