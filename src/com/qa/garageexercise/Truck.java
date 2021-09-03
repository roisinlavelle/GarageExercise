package com.qa.garageexercise;

public class Truck extends Vehicle {
	
	public int noOfHeadlights;
	public String colour;
	
	public float calcBill() {
		
		int totalBill = 0;
		String condition = colour;
		
		if (condition == "Neon") {
			return totalBill * 2;
		}
		
		return totalBill;
	}

	public Truck(int ID, String engine, int noOfWheels, boolean carDrives) {
		super(ID, engine, noOfWheels, carDrives);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param engine
	 * @param noOfWheels
	 * @param carDrives
	 * @param noOfHeadlights
	 * @param colour
	 */
	public Truck(int ID, String engine, int noOfWheels, boolean carDrives, int noOfHeadlights, String colour) {
		super(ID, engine, noOfWheels, carDrives);
		this.ID = ID;
		this.noOfHeadlights = noOfHeadlights;
		this.colour = colour;
	}
	
	public int getID() {
		return ID;
	}
	
	public int setID() {
		this.ID = ID;
	}

	public int getNoOfHeadlights() {
		return noOfHeadlights;
	}

	public void setNoOfHeadlights(int noOfHeadlights) {
		this.noOfHeadlights = noOfHeadlights;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
