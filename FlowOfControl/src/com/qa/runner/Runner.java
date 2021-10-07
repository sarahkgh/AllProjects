package com.qa.runner;


import com.qa.demo.DiceRoller;
import com.qa.demo.Scope;

//import com.qa.demo.ControlFlow;
//import com.qa.demo.Stack;

public class Runner {
	public static void main(String[] args) {
//		ControlFlow.method3();
//		ControlFlow.method2();
//		ControlFlow.method1();
		//System.out.println(Stack.secondLayer(4));
		
		//System.out.println(Stack.firstLayer());
		
		System.out.println(DiceRoller.getRandNum(5));
		
		System.out.println(DiceRoller.sixSidedDice());
		
		Scope.conflictingDemo();
		Scope.localDemo();
	}
}

//ctrl shift 0 auto imports
