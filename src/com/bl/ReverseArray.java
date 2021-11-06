package com.bl;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		

		int[] arr = new int[] { 2, 3, 4 };
		reverseArray(arr, arr.length);

		int[] arr1 = new int[] { 2, 3, 5 };
		reverseArray1(arr1, arr.length);

	}

	private static void reverseArray(int[] arr, int length) {
		int[] newArray = new int[length];
		int j = length;
		for (int l = 0; l < length; l++) {
			newArray[j - 1] = arr[l];
			j--;

		}
		System.out.println(Arrays.toString(newArray));

	}

	private static void reverseArray1(int[] arr1, int length) {
		int[] newArray = new int[length];
		int j = length;
		for (int l = 0; l < length; l++) {
			newArray[j - 1] = arr1[l];
			j--;

		}
		System.out.println(Arrays.toString(newArray));

	}

}
