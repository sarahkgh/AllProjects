package com.qa.demo;

import java.util.Random;

public class DiceRoller {
	public static int getRandNum(int num) {
		return new Random().nextInt(num);
	}
	
	
	public static int sixSidedDice() {
	int diceRoll = new Random().nextInt(6);
	return diceRoll ++;
	}

}
