package com.bl;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a number to check palindrome or not");
		int num = Sc.nextInt();

		int org_num = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(" reverse number is  :" + rev);
		if (org_num == rev) {
			System.out.println(org_num + "  is Palindrome number ");
		} else {
			System.out.println(org_num + "  is Not Palindrome number");
		}
	}

}
