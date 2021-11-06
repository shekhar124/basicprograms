package com.bl;

public class CountEvenAndAdd {
	public static void main(String[] args) {

		int num = 12345;
		int even_count = 0;
		int add_count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				add_count++;

			}

			num = num / 10;
		}
		System.out.println("even count  :" + even_count);
		System.out.println("add count :" + add_count);
	}

}
