package com.zoho;

import java.util.Arrays;

/*Two sorted arrays will be given.Create an array consisting of the elements of two arrays with duplicate elements removed in sorted order 
Note Use only one loop.No sorting */
public class MergeArrayProgram {
	private static int[] mergeArray(int[] arrayA, int[] arrayB) {
		int mergeArray[] = new int[arrayA.length + arrayB.length];
		int i = 0, j = 0, k = 0;

		while (i < arrayA.length && j < arrayB.length) {
			if (arrayA[i] < arrayB[j]) {
				if (k == 0 || mergeArray[k - 1] != arrayA[i]) {
					mergeArray[k++] = arrayA[i];
				}
				i++;
			}
			else if (arrayA[i] > arrayB[j]) {
				if (k == 0 || mergeArray[k - 1] != arrayB[j]) {
					mergeArray[k++] = arrayB[j];
				}
				j++;
			}
			else {
				if(k==0 || mergeArray[k-1]!=arrayA[i]) {
					mergeArray[k++]=arrayA[i];
				}
				i++;
				j++;
			}
		}
		while (i < arrayA.length) {
			if (k == 0 || mergeArray[k - 1] != arrayA[i]) {
				mergeArray[k++] = arrayA[i];
			}
			i++;
		}
		while (j < arrayB.length) {
			if (k == 0 || mergeArray[k - 1] != arrayB[j]) {
				mergeArray[k++] = arrayB[j];
			}
			j++;
		}

		return mergeArray;

	}

	public static void main(String[] args) {
		int[] arrayA = new int[] { -7, 12, 19, 29, 41, 56, 79 };
		int[] arrayB = new int[] { -9, -3, 0, 5, 19 };

		int[] mergedArray = mergeArray(arrayA, arrayB);

		System.out.println("Array A : " + Arrays.toString(arrayA));
		System.out.println("Array B : " + Arrays.toString(arrayB));
		System.out.println("Merged Array without duplicates: " + Arrays.toString(mergedArray));
	}
}
