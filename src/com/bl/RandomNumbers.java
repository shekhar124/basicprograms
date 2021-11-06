package com.bl;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		// by using Random class
		int random= rand.nextInt(1000);
		System.out.println("random :"+random);
		
		double rand1 = rand.nextDouble();
		System.out.println("ran" + rand1);
		
		
		// by using Math.random class
		Math.random();
		System.out.println("Math" +  Math.random());
	}

}
