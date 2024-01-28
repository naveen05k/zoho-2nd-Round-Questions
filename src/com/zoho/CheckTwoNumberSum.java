package com.zoho;

public class CheckTwoNumberSum {
	public static void main(String[] args) {
		int[] array = { 1, 3, 4, 8, 10 };
		int tar = 7;
		//boolean ouput = isPosible(array, tar);
		boolean ouput = method2(array, tar);
		System.out.println(ouput);

	}

///method 1:
	static boolean isPosible(int arr[], int tar) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (tar == arr[i] + arr[j]) {
					return true;
				}
			}
		}

		return false;
	}

//method 2 
	static boolean method2(int arr[], int tar) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			 int current = arr[start] + arr[end];
			 if(current==tar) {
				 return true;
			 }
			 else if(current < tar){
				 start++;
			 }else {
				 end--;
			 }

		}
		return false;
	}
}
