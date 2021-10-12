package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicle.car;
import com.qa.vehicle.vehicle;

public class Garage {
ArrayList<vehicle> vehicleList = new ArrayList<>();

public void addvehicle(vehicle v) {
	System.out.println(vehicleList);
	vehicleList.add(v);
	System.out.println("The vehicles are now: " + vehicleList);
}

public void removevehicle(vehicle z) {
	System.out.println(vehicleList);
	vehicleList.remove(z);
	System.out.println("The vehicles are now: " + vehicleList);
}

public void clearvehicle() {
	System.out.println(vehicleList);
	vehicleList.clear();
	System.out.println("The vehicles are now: " + vehicleList);
}
}
