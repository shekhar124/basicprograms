package com.bl;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153, r, sum = 0, a = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		if (a == sum) {
			System.out.println("it is Arrmstrong number");

		} else {
			System.out.println("not Armstrong number");
		}
	}

}
