package com.bl;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a String to check palindrome or not");
		String str = Sc.nextLine();
		String org_str = str;

		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (org_str.equals(rev)) {
			System.out.println(org_str + "  is Palindrome string ");
		} else {
			System.out.println(org_str + "  is not Palindrome string ");
		}

	}

}

