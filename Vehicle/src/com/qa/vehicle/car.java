package com.qa.vehicle;

public class car extends vehicle {
	
	
		
	public int doors;
	public String model;
	public boolean isElectric;
	
	public car(String type, int seats, String colour, boolean isLeftHandDrive, int doors, String model,
			boolean isElectric) {
		super(type, seats, colour, isLeftHandDrive);
		this.doors = doors;
		this.model = model;
		this.isElectric = isElectric;
	}

	@Override
	public String toString() {
		return "car [doors=" + doors + ", model=" + model + ", isElectric=" + isElectric + ", type=" + type + ", seats="
				+ seats + ", colour=" + colour + ", isLeftHandDrive=" + isLeftHandDrive + "]";
	}

	
	

	}


