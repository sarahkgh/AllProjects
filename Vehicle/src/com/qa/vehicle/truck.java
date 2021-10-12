package com.qa.vehicle;

public class truck extends vehicle {
public boolean hasCamera;
public int wheels;

public truck(String type, int seats, String colour, boolean isLeftHandDrive, boolean hasCamera, int wheels) {
	super(type, seats, colour, isLeftHandDrive);
	this.hasCamera = hasCamera;
	this.wheels = wheels;
}




}
