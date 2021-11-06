package com.bl;

public class NumberofDidites {
	public static void main(String[] args) {
		int num = 123434;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of Digites  : " + count);
	}

}
