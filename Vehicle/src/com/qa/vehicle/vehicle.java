package com.qa.vehicle;

public abstract class vehicle {
public String type;
public int seats;
public String colour;
public boolean isLeftHandDrive;

public vehicle(String type, int seats, String colour, boolean isLeftHandDrive) {
	super();
	this.type = type;
	this.seats = seats;
	this.colour = colour;
	this.isLeftHandDrive = isLeftHandDrive;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getSeats() {
	return seats;
}

public void setSeats(int seats) {
	this.seats = seats;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public boolean isLeftHandDrive() {
	return isLeftHandDrive;
}

public void setLeftHandDrive(boolean isLeftHandDrive) {
	this.isLeftHandDrive = isLeftHandDrive;
}

@Override
public String toString() {
	return "vehicle [type=" + type + ", seats=" + seats + ", colour=" + colour + ", isLeftHandDrive=" + isLeftHandDrive
			+ "]";
}


}
