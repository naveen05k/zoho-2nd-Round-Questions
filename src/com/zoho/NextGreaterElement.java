package com.zoho;
/*Find the next greter element for each element in given array */
public class NextGreaterElement {

	public static void main(String[] args) {
		//int array[] = { 6, 3, 9, 10, 8, 2, 1, 15, 7 };
		 int arr[]= {11, 13, 21, 3};
		findNextGreaterElement(arr);
	}

	static void findNextGreaterElement(int[] arr) {

		int next;
		for (int i = 0; i < arr.length; i++) {
			next = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + "->" + next);
		}

	}

}
