package com.bl;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
	
		int i,  flag = 0; 
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i<n; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} 
	}
}
