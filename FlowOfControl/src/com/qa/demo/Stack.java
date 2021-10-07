package com.qa.demo;

public class Stack {
	public static int firstLayer() {
		int total = 5;
		total += secondLayer(3);
		return total;
	}

	public static int secondLayer(int num) {
		int subTotal = num * 2;
		return subTotal;
	}
}
