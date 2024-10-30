package com.promineotech;

import java.util.Random;


public class TestDemo {
	//addition method
	public int addPositive(int a, int b) {
    	if(a > 0 && b > 0) {
    		return a + b;
    	} else {
    		throw new IllegalArgumentException("Both parameters must be positive!");
    	}
	}
	//multiplication method 
	public int multiply(int a, int b) {
		long result = (long) a * b;
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			throw new ArithmeticException("Integer overflow in multiplication");
		} return (int) result;
	}
	
	public int randomNumberSquared() {
		int result = getRandomInt();
		return result * result;
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
