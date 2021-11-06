package com.bl;

import java.util.Arrays;

public class SortingNumbers {
	public static void main(String[] args) {
		int a[] = { 5, 6, 4, 3, 2 };
		System.out.println("Before swapping " + Arrays.toString(a));
		int n = a.length;
		System.out.println("length of array : " + n);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}

		System.out.println("After swapping " + Arrays.toString(a));

	}

}
