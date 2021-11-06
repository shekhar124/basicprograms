package com.bl;

public class SwapTwoNumbers {
	

	public static void printLogic1() {
		int a = 10, b = 20;
		System.out.println("before swaping   " + a + "  " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After swaping   " + a + "  " + b);
	}
	public static void printLogic2() {
		int a = 10, b = 20;
		a=a+b;//a=10+20=30
		b=a-b;//b=30-20=10
		a=a-b;//a=30-10=20
		System.out.println(a+" "+b);
		
	}
	public static void printLogic3() {
		int a = 10, b = 20;
		a=a*b;//a=10*20=200
		b=a/b;//b=200/20=10
		a=a/b;//a=200/10=20
		System.out.println(a+" "+b);
		
	}
	public static void printLogic4() {
		int a = 10, b = 20;
		a=a^b;//a=30
		b=a^b;//b=10
		a=a^b;//a=20
		System.out.println(a+" "+b);
		
	}
	public static void printLogic5() {
		int a=10, b=20;
		b=a+b-(a=b);
		
		System.out.println(a+" "+b);
		
	}
	

	public static void main(String[] args) {
		printLogic1();
		printLogic2();
		printLogic3();
		printLogic4();
		printLogic5();

	}
}
