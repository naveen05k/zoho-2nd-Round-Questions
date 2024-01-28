package com.zoho;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-2 ,-3 ,4 ,-1, -2, 1, 5, -3};
		int output = maxSubarray(array);
		System.out.println(output);

	}

	static int maxSubarray(int arr[]) {
		int max = arr[0];
		int start =0;
		int end =0;
		
		
		for(int i=0;i<arr.length-1;i++) {
			int sum =0;
			for(int j=i;j<=arr.length-1;j++) {
				sum+=arr[j];
				if(sum>max) {
					max = sum;
					start=i;
					end =j;
				}
			}
		}
		for(int i=start;i<end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return max;
	}

}
