package com.bl;

public class PrintEvenAndOddNumber {
	public static void main(String[] args) {

		System.out.println("print even numbers");

		int a[] = { 1, 2, 4, 5, 6, 25 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)

				System.out.println(a[i]);
		}
		System.out.println("print odd numbers");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0)
				System.out.println(a[i]);
		}

//		System.out.println("enhance for loop for even");
//		for (int v : a) {
//			if (v % 2 == 0)
//				System.out.println(v);
//
//		}
//		System.out.println("enhance for loop for odd");
//		for (int v : a) {
//			if (v % 2 != 0)
//				System.out.println(v);

//		}

	}

}
