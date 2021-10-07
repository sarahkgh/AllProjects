package com.qa.demo;


public class Scope {
static int numberVar = 123;

static int bankDetails = 6453502;

public static void methodDemo() {
	System.out.println(numberVar);
}
public static void conflictingDemo() {
	int numberVar = 20;
	System.out.println(numberVar);
}

public static void bigH4ck3r() {
	System.out.println(bankDetails);
	
}

public static void localDemo() {
	String password = "unicorn23";
	System.out.println(password);
}

private static void printPassword() {
	//System.out.println(password);
}
}


