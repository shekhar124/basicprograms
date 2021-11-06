package com.bl;

public class FactroialNumbers {
	public static void main(String[] args) {
		int num = 5;
		long factroial = 1;

		for (int i = 1; i <= num; i++) {

			factroial = factroial * i;

		}
		System.out.println(factroial);
	}

}
