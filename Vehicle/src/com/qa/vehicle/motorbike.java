package com.qa.vehicle;

public class motorbike extends vehicle {
public String make;
public boolean isSport;


public motorbike(String type, int seats, String colour, boolean isLeftHandDrive, String make, boolean isSport) {
	super(type, seats, colour, isLeftHandDrive);
	this.make = make;
	this.isSport = isSport;
}


@Override
public String toString() {
	return "motorbike [make=" + make + ", isSport=" + isSport + ", type=" + type + ", seats=" + seats + ", colour="
			+ colour + ", isLeftHandDrive=" + isLeftHandDrive + "]";
}


}
