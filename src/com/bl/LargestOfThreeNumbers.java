package com.bl;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		System.out.println("Enter number");
		int b= sc.nextInt();
		System.out.println("Enter number");
		
		int c= sc.nextInt();
		//by using regular method
		/*if(a>b && a>c) {
			System.out.println(a + "  is larger");
		}
		else if (b>c && b>a){
			System.out.println(b + "    is larger");
		}
		else {
			System.out.println(c + "  is larger");
		}*/
		
		
		//by using Ternary operator
		
		int Largest1 = a>b?a:b;
		int L2 = c>Largest1?c:Largest1;
		System.out.println(L2 + "  >> is Largest");
		

	}

}
