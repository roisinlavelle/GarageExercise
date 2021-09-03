package com.qa.garageexercise;

public class Vehicle {
	
	public int ID;
	public String engine;
	public int noOfWheels;
	public boolean carDrives;
	
	
	public float calcBill() {
		
		int totalBill = 0;
		
		totalBill += (noOfWheels*5);
		
		return totalBill;
	}
	
	
	

	public Vehicle(int ID, String engine, int noOfWheels, boolean carDrives) {
		super();
		this.ID = ID;
		this.engine = engine;
		this.noOfWheels = noOfWheels;
		this.carDrives = carDrives;
	}
	public int ID() {
		return ID;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public boolean isCarDrives() {
		return carDrives;
	}
	public void setCarDrives(boolean carDrives) {
		this.carDrives = carDrives;
	}
	
	

}
