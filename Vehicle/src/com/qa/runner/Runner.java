package com.qa.runner;

import com.qa.garage.Garage;
import com.qa.vehicle.car;
import com.qa.vehicle.motorbike;
import com.qa.vehicle.vehicle;

public class Runner {
public static void main(String[] args) {
	vehicle ford = new car("ford", 5, "blue", false, 4, "focus", false);
	vehicle kawasaki = new motorbike("cruiser", 2, "red", false, "zdx6", true);
	vehicle truck = new com.qa.vehicle.truck("18 wheeler", 3, "black", true, true, 18);
	
	
	Garage newGarage = new Garage();
	newGarage.addvehicle(ford);
	newGarage.removevehicle(kawasaki);
	newGarage.clearvehicle();
}
}
