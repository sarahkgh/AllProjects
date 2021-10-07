package com.qa.conditional;

public class Conditional {
	public static void redDemo(String colour) {
		if (colour == "red") {
			System.out.println("red");
		} else {
			System.out.println("Not red");
		}
		
	}


	public static int numDemo(int x, int y, int z) {
		return x * y * z;
	}

	public static String numString(int x) {
		switch (x) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		default:
			return "not a number";
		}
	}
}
