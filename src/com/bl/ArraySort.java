package com.bl;

public class ArraySort {

	public static void main(String[] args) {
		String a[] = new String[] { "this", "is", "a", "demo", "array", "for", "input" };
		int L = a.length;

		String temp;
		for (int i = 0; i < L; i++) {
			for (int j = i; j < L; j++) {

				//if (a[i] > a[j])

				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		

//		for (String v : str) {
//			System.out.println(v + "");
//
//		}
//		System.out.println("length of array" + L);
		
	}
	

}
